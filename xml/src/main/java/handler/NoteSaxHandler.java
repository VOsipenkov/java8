package handler;

import dto.Note;
import dto.Notes;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class NoteSaxHandler extends DefaultHandler {
    @Getter
    private Notes notes;
    private String qName;
    private int i;

    @Override
    public void startDocument() throws SAXException {
        notes = new Notes(new ArrayList<Note>());
        i = -1;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        this.qName = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        switch (qName) {
            case "Note":
                i++;
                notes.getNotes().add(new Note());
                break;
            case "objectId":
                notes.getNotes().get(i).setObjectId(new String(ch, start, length));
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
        }
    }
}
