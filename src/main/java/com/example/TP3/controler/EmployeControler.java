package com.example.TP3.controler;


import com.example.TP3.manager.EmployerManager;
import com.example.TP3.model.Employe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeControler {

    EmployerManager manager = new EmployerManager();

    @GetMapping
    public List<Employe> getEmployers() {
        return manager.getEmployers();
    }
}

