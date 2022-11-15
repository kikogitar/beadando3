/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.beadando.resources.Book;
import com.mycompany.beadando.resources.Borito;
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
import java.util.Scanner;


public class xmlread {
    public static ArrayList<Book> Xmlolvas() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            DocumentBuilderFactory documentBuilderFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder =
                    documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("D:\\Kiko\\netbeans\\projektek\\beadando3\\src\\main\\java\\controller\\books.xml");

            Element rootElement = document.getDocumentElement();

            NodeList childNodesList = rootElement.getChildNodes();

            int numberOfElementNodes = 0;
            Node node;
            for (int i = 0; i < childNodesList.getLength(); i++) {
                node = childNodesList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    numberOfElementNodes++;
                    NodeList childNodesOfBooksTag = node.getChildNodes();
                    String id = "", szerzo = "", cim = "", oldal = "", borito = "";
                    int temp =childNodesOfBooksTag.getLength();
                    for (int j = 0; j < childNodesOfBooksTag.getLength(); j++) {

                         if (childNodesOfBooksTag.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            if (null!=childNodesOfBooksTag.item(j).getNodeName())switch (childNodesOfBooksTag.item(j).getNodeName()) {
                                 case "id":
                                     id = childNodesOfBooksTag.item(j).getTextContent();
                                     break;
                                 case "szerzo":
                                     szerzo = childNodesOfBooksTag.item(j).getTextContent();
                                     break;
                                 case "cim":
                                     cim = childNodesOfBooksTag.item(j).getTextContent();
                                     break;
                                 case "oldal":
                                     oldal = childNodesOfBooksTag.item(j).getTextContent();
                                     break;
                                 case "borito":
                                     borito = childNodesOfBooksTag.item(j).getTextContent();
                                     break;
                                 default:
                                     break;
                             }
                            /*
                             switch (childNodesOfBooksTag.item(j).getNodeName()) {
                             case "id" -> id = childNodesOfBooksTag.item(j).getTextContent();
                             case "szerzo" -> szerzo = childNodesOfBooksTag.item(j).getTextContent();
                             case "cim" -> cim = childNodesOfBooksTag.item(j).getTextContent();
                             case "oldal" -> oldal = childNodesOfBooksTag.item(j).getTextContent();
                             case "borito" -> borito = childNodesOfBooksTag.item(j).getTextContent();
                              */
                            
                            

                           }
                    }
                        
                    
                    books.add(new Book(Integer.parseInt(id), szerzo, cim,
                            Integer.parseInt(oldal), Borito.valueOf(borito) ));
                    }
                
                    
                }
            
        } catch (Exception e) {          
            e.printStackTrace();
        }
        return books;
    }
    
}
