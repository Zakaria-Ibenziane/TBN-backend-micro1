package com.yazoo.tnbbackendmicro1.controller;


import com.yazoo.tnbbackendmicro1.model.Terrain;
import com.yazoo.tnbbackendmicro1.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terrains")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @GetMapping()
    public List<Terrain> searchTerrain() {
        return terrainService.findAll();
    }

    @PostMapping()
    public Terrain addTerrain(@RequestBody Terrain terrain) {
        return terrainService.addTerrain(terrain);
    }
}
