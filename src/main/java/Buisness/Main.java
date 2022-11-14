/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buisness;

import controller.xmlread;
import com.mycompany.beadando.resources.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    public static JSONArray kiir() {
        
        ArrayList<Book> books = xmlread.Xmlolvas();
        JSONArray resp = new JSONArray();
        resp.put(books);
        
        
          return resp;
    }
    
}

