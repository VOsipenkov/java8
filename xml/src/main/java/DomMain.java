import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Класс универсальный, может распечатывать все xml.
 * Dom-parser
 */
public class DomMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document doc = documentBuilder.parse(new File("xml/src/main/resources/Car.xml"));
        print(doc.getDocumentElement(), 0);
    }

    /**
     * Передаем element и кол-во знаков табуляции. Распечатываем переданный элемент и вызываем у него все
     * дочерние ноды, передав на один больше символов табуляции.
     * Среди дочерних нод для нашего element будем передавать для того чтобы распечать только экземпляры типа Element
     * все ноды типа Text пропускаем так они содержат символ переноса строки
     *
     * @param element
     * @param i
     */
    static void print(Element element, int i) {
        if (element == null) return;
        System.out.print("\n" + getTab(i) + element.getTagName());
        if (!element.getFirstChild().getTextContent().trim().isEmpty()) {
            System.out.print(":   " + element.getFirstChild().getTextContent().trim());
        }

        for (int j = 0; j < element.getChildNodes().getLength(); j++) {
            if (element.getChildNodes().item(j) instanceof Element) {
                print((Element) element.getChildNodes().item(j), i + 1);
            }
        }
    }

    /**
     * Генерируем нужное количество символов табуляции
     *
     * @param i
     * @return
     */
    static String getTab(int i) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < i; j++) {
            result.append("\t");
        }
        return result.toString();
    }
}
