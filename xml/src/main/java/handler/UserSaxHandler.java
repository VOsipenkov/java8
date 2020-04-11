package handler;

import dto.Notes;
import dto.User;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserSaxHandler extends DefaultHandler {
    private User user;
    private String qName;
    
    public String toString(){
        return user.toString();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("document started..");
        user = new User();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        this.qName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        this.qName = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value;
        if (qName == null) return;
        value = new String(ch, start, length);

        switch (qName) {
            case "name":
                user.setName(value);
                break;
            case "surname":
                user.setSurname(value);
                break;
            case "age":
                user.setAge(Integer.parseInt(value));
                break;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("document ended..");
    }
}
