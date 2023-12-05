package com.yazoo.tnbbackendmicro1.controller;


import com.yazoo.tnbbackendmicro1.model.CategorieTerrain;
import com.yazoo.tnbbackendmicro1.service.CategorieTerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategorieTerrainController {

    @Autowired
    private CategorieTerrainService categorieTerrainService;

    @GetMapping()
    public List<CategorieTerrain> searchCategorie() {
        return categorieTerrainService.findAll();
    }

    @PostMapping()
    public CategorieTerrain addCategorie(@RequestBody CategorieTerrain categorieTerrain) {
        return categorieTerrainService.addCategorie(categorieTerrain);
    }


}
