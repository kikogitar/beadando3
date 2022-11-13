/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access;
import com.mycompany.beadando.resources.Book;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 *
 * @author Kristóf
 */
public class xmlwrite {
    public static void ment(ArrayList<Book> books) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = document.createElement("Books");
            document.appendChild(rootElement);

            for (Book book : books) {
                Element bookElement = document.createElement("book");
                rootElement.appendChild(bookElement);
                createChildElement(document, bookElement, "id", String.valueOf(book.getId()));
                createChildElement(document, bookElement, "szerzo", book.getSzerzo());
                createChildElement(document, bookElement, "cim", book.getCim());
                createChildElement(document, bookElement, "oldal", String.valueOf(book.getOldal()));
                createChildElement(document, bookElement, "borito", String.valueOf(book.getBorito()));
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileOutputStream("books.xml"));

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("Sikeres mentés\n");
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }
    private static void createChildElement(Document document, Element parent,
                                           String tagName, String value) {
        Element element = document.createElement(tagName);
        element.setTextContent(value);
        parent.appendChild(element);
    }
}
    

