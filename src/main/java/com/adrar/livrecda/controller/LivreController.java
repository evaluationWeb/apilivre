package com.adrar.livrecda.controller;

import com.adrar.livrecda.exception.LivreNotFoundException;
import com.adrar.livrecda.model.Livre;
import com.adrar.livrecda.repository.LivreRepository;
import com.adrar.livrecda.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivreController {

    @Autowired
    private LivreService livreService;


    @GetMapping("/livres")
    public List<Livre> getLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping("/livre/{id}")
    public Livre getLivreById(@PathVariable Long id) {
        return livreService.getLivreById(id);
    }

    @PostMapping("/livre")
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.saveLivre(livre);
    }

    @DeleteMapping("/livre/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivreById(id);
    }

    @PatchMapping("/livre/{id}")
    public Optional<Livre> updateLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.updateLivreById(id, livre);
    }
}
