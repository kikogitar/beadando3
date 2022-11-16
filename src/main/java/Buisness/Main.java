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
        JSONObject resp = new JSONObject();
        JSONArray ki = new JSONArray();
        for (int i=0; i < books.size();i++) {
            resp.put("id", books.get(i).getId());
            resp.put("szerzo", books.get(i).getSzerzo());
            resp.put("cim", books.get(i).getCim());
            resp.put("oldal", books.get(i).getOldal());
            resp.put("borito", books.get(i).getBorito());
            ki.put(resp);
        }
        
        
          return ki;
    }
    
}

