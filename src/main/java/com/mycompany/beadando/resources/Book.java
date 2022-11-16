package com.mycompany.beadando.resources;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.beadando.resources.Borito;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Book {
    
    private String szerzo;
    private int id;
    private String cim;
    private Integer oldal;
    private Borito borito;

    public Book(int id, String szerzo, String cim, int oldal, Borito bor) {
        this.id = id;
        this.szerzo = szerzo;
        this.cim = cim;
        this.oldal = oldal;
        this.borito = bor;
    }
    public Book() {
        
    }

    /*public Book (int id) {
        try {this.id=id;
            System.out.print("Add meg a könyv szerzőjét: ");
            this.szerzo = scanner.nextLine();
            System.out.print("Add meg a könyv címét: ");
            this.cim = scanner.nextLine();
            System.out.print("Add meg a könyv oldalszámát:");
            this.oldal= scanner.nextInt();
            scanner.nextLine();
            System.out.print("Add meg a borító típusát:");
            String borito = scanner.nextLine();
            this.borito= Borito.valueOf(borito);
        } catch (InputMismatchException ex) {
            //ex.printStackTrace();
            scanner.nextLine();
            System.out.println("Érvénytelen adat\n");
            return;
        } catch (IllegalArgumentException ex) {
            //ex.printStackTrace();
            System.out.println("Érvénytelen adat\n");
            return;
        }
    }
*/
    /*
    public void modosit() {
        try {
            System.out.print("Add meg a könyv szerzőjét: ");
            this.szerzo=scanner.nextLine();
            System.out.print("Add meg a könyv címét: ");
            this.cim=scanner.nextLine();
            System.out.print("Add meg a könyv olodalszámát: ");
            this.oldal=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Add meg a borító típusát:");
            this.borito=Borito.valueOf(scanner.nextLine());
            System.out.println("Sikeres változtatás\n");
            return;
        } catch (InputMismatchException ex) {
            scanner.nextLine();
            System.out.println("Érvénytelen adat\n");
            return;
        }catch (IllegalArgumentException ex) {
            //ex.printStackTrace();
            System.out.println("Érvénytelen adat\n");
            return;
        }
    }
*/
    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public void setBorito(Borito borito) {
        this.borito = borito;
    }


    public Borito getBorito() {
        return borito;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public Integer getOldal() {
        return oldal;
    }

    public void setOldal(Integer oldal) {
        this.oldal = oldal;
    }

}
