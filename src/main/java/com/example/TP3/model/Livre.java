package com.example.TP3.model;

public class Livre {

    private String name;
    private String ISBN;

    private int id;

    public Livre(String name, String ISBN,int id) {
        this.name = name;
        this.ISBN = ISBN;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
