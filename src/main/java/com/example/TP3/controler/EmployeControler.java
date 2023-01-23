package com.example.TP3.controler;


import com.example.TP3.ObjectifyConfig;
import com.example.TP3.manager.EmployerManager;
import com.example.TP3.model.Employe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Servlet;
import java.util.List;

@RestController
public class EmployeControler {

    EmployerManager manager = new EmployerManager();

    @GetMapping("/employe")
    public List<Employe> getEmployers() {
        return manager.getEmployers();
    }


    @PostMapping("/employe")
    public void addEmploye(Employe employe) {
        manager.addEmploye(employe);
    }
}

