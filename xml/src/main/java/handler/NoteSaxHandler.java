package handler;

import dto.Note;
import dto.Notes;
import dto.ObjectReference;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class NoteSaxHandler extends DefaultHandler {
    @Getter
    private Notes notes;
    private String qName;
    private String parentNode;
    private int i;//Note id
    private int j;//objectReferenceItem

    @Override
    public void startDocument() throws SAXException {
        notes = new Notes(new ArrayList<Note>());
        i = -1;

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        this.parentNode = this.qName;
        this.qName = qName;
    }

    /**
     * пиши, иначе будет дефект что не проставились поля. После прохода каждого элемента, qName обязательно занулять
     * после прохождения элемента
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        this.qName = "";
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end parsing..");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        switch (qName) {
            case "Note":
                i++;
                j = -1;
                notes.getNotes().add(new Note());
                break;
            case "objectId":
                String s = new String(ch, start, length);
                if (parentNode.equals("Note")) {
                    notes.getNotes().get(i).setObjectId(s);
                } else if (parentNode.equals("ObjectReference")) {
                    notes.getNotes().get(i).getObjectReferences().get(j).setObjectId(s);
                }
                break;
            case "updateDateTime":
                notes.getNotes().get(i).setUpdateDateTime(new String(ch, start, length));
                break;
            case "notation":
                notes.getNotes().get(i).setNotation(new String(ch, start, length));
                break;
            case "dateTimeCalc":
                notes.getNotes().get(i).setDateTimeCalc(new String(ch, start, length));
                break;
            case "authorId":
                notes.getNotes().get(i).setAuthorId(new String(ch, start, length));
                break;
            case "authorName":
                notes.getNotes().get(i).setAuthorName(new String(ch, start, length));
                break;
            case "ObjectReference":
                if (notes.getNotes().get(i).getObjectReferences() == null)
                    notes.getNotes().get(i).setObjectReferences(new ArrayList<ObjectReference>());
                notes.getNotes().get(i).getObjectReferences().add(new ObjectReference());
                j++;
                break;
            case "entityType":
                String value = new String(ch, start, length);
                notes.getNotes().get(i).getObjectReferences().get(j).setEntityType(value);
        }
    }
}
