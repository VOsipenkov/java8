import handler.NoteSaxHandler;
import handler.UserSaxHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;

public class SaxMain {
    public static void main(String[] args) throws Exception {
        parseNotes();
    }

    /*
     * Парс файла Note.xml
     */
    public static void parseNotes() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        NoteSaxHandler handler = new NoteSaxHandler();

        saxParser.parse(new File("xml/src/main/resources/Note.xml"), handler);
        System.out.println(handler.getNotes());
    }

    /* Парс файла User*/
    public static void parseUser() throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        File file = new File("xml/src/main/resources/User.xml");
        if (!file.exists()) throw new FileNotFoundException("не найден файл..");

        UserSaxHandler handler = new UserSaxHandler();
        saxParser.parse(file, handler);
        System.out.println(handler);
    }
}
