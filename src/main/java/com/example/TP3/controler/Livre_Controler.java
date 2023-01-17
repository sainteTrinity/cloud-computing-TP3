package com.example.TP3.controler;



import com.example.TP3.manager.LivreManager;
import com.example.TP3.model.Livre;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Livre_Controler {

    LivreManager manager = new LivreManager();

    @GetMapping("/livres")
    public ArrayList<Livre> getAllLivres() {
        return manager.getAllLivres();
    }

    @PostMapping(value = "/livre", consumes = "application/json")
    public void addLivre(@RequestBody Livre livre) {
        manager.addLivre(livre);
    }

    @GetMapping(value = "/livre/{id}")
    public Livre getLivreById(@PathVariable int id) {
        return manager.getLivreById(id);
    }


}
