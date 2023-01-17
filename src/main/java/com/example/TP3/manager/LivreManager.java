package com.example.TP3.manager;


import com.example.TP3.model.Livre;

import java.util.ArrayList;

public class LivreManager {

    private ArrayList<Livre> lesLivres = new ArrayList<Livre>();

    public LivreManager(){

        Livre livre = new Livre("Test","douze", 1);
        Livre livre2 = new Livre("Test2","douze", 2);
        Livre livre3 = new Livre("Test3","douze", 3);
        Livre livre4 = new Livre("Test4","douze", 4);

        lesLivres.add(livre);
        lesLivres.add(livre2);
        lesLivres.add(livre3);
        lesLivres.add(livre4);
    }


    public ArrayList<Livre> getAllLivres(){
        return lesLivres;
    }

    public void addLivre(Livre livre){
        //TO-DO: Ajout des exeptions sur les Livres

        lesLivres.add(livre);
    }

    public Livre getLivreById(int id){
        for(Livre livre : lesLivres){
            if(livre.getId() == id){
                return livre;
            }
        }
        return null;
    }
}
