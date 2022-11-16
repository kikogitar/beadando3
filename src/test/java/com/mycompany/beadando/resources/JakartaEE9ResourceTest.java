/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.beadando.resources;

import controller.xmlread;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class JakartaEE9ResourceTest {
    
    public JakartaEE9ResourceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ping method, of class JakartaEE9Resource.
     
    @Test
    public void testPing() {
        System.out.println("ping");
        JakartaEE9Resource instance = new JakartaEE9Resource();
        Response expResult = null;
        Response result = instance.ping();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of lista method, of class JakartaEE9Resource.
     
    @Test
    public void testLista() {
        System.out.println("lista");
        JakartaEE9Resource instance = new JakartaEE9Resource();
        Response expResult = null;
        Response result = instance.lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of ptest method, of class JakartaEE9Resource.
     
    @Test
    public void testPtest() {
        System.out.println("ptest");
        Object o = null;
        JakartaEE9Resource instance = new JakartaEE9Resource();
        Response expResult = null;
        Response result = instance.ptest(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of hozzad method, of class JakartaEE9Resource.
    
    
    @Test
    public void testHozzad() {
        System.out.println("hozzad");
        ArrayList tmp = xmlread.Xmlolvas();
        Book be = (Book) tmp.get(0) ;
        JakartaEE9Resource instance = new JakartaEE9Resource();
        Response result = instance.hozzad(be);
        assertEquals(result, result);
        
    }
 */
   
}
