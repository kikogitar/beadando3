package com.mycompany.beadando.resources;

import Buisness.Main;
import controller.xmlread;
import controller.xmlwrite;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
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
        JSONArray ki = Main.kiir();
        return Response.ok(ki.toString())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response ptest(Object o) {
        JSONObject resp = new JSONObject(o);       
        return Response.ok(o.toString())
                .build();
    }
    
    @POST
    @Path("/hozzad")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response hozzad(Book be) {
        ArrayList<Book> books = xmlread.Xmlolvas();
        books.add(be);
        xmlwrite.ment(books);                      
        return Response.ok("siker")
                .build();
    }
    
    
    
    
    
}
