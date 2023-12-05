package com.yazoo.tnbbackendmicro1.controller;


import com.yazoo.tnbbackendmicro1.model.Historique;
import com.yazoo.tnbbackendmicro1.service.HistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historiques")
public class HistoriqueController {

    @Autowired
    private HistoriqueService historiqueService;

    @GetMapping()
    public List<Historique> searchHistorique(@RequestParam String nomCategorie) {
        return historiqueService.findByNomCategorie(nomCategorie);
    }

    @PostMapping()
    public Historique addHistorique(@RequestBody Historique historique) {
        return historiqueService.addHistorique(historique);
    }
}
