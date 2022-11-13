package com.mycompany.beadando.resources;

import Buisness.Main;
import access.xmlread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;


@Path("jakartaee9")
public class JakartaEE9Resource {
    
    @GET
    public Response ping(){
        JSONObject resp = new JSONObject();
        resp.put("teszt", "izé");
        return Response
                .ok(resp.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
    @GET
    @Path("/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public Response lista() {
        ArrayList<Book> books = xmlread.Xmlolvas();
        JSONObject resp = new JSONObject();
        for (int i=0; i < books.size();i++) {
            resp.put("könyv", books.get(i).getId());
            resp.put(books.get(i).getSzerzo(), books.get(i).getBorito());
            resp.put(books.get(i).getCim(), books.get(i).getOldal());
        }
            
        
        return Response.ok(resp.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
    @GET
    @Path("/ment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ment() {
        ArrayList<Book> books = xmlread.Xmlolvas();
        JSONObject resp = new JSONObject();
        for (int i=0; i < books.size();i++) {
            resp.put("könyv", books.get(i).getId());
            resp.put(books.get(i).getSzerzo(), books.get(i).getBorito());
            resp.put(books.get(i).getCim(), books.get(i).getOldal());
        }
            
        
        return Response.ok(resp.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
    
    
}
