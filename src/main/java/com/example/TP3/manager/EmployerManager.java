package com.example.TP3.manager;

import com.example.TP3.model.Employe;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class EmployerManager {


    private final List<Employe> employers = new ArrayList<>();

    public EmployerManager() {
        employers.add(new Employe("Dupond", "Martin"));
        employers.add(new Employe("Martin", "Dupond"));
        employers.add(new Employe("dup", "mart"));
    }
    public List<Employe> getEmployers() {
        //return employers.sort((e1, e2) -> e1.getNom().compareTo(e2.getNom()));
        return employers;
    }

    public void addEmploye(Employe employe) {
        employers.add(employe);
    }
}
