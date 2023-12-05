package com.yazoo.tnbbackendmicro1.controller;


import com.yazoo.tnbbackendmicro1.model.Redevable;
import com.yazoo.tnbbackendmicro1.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redevables")
public class RedevableController {

    @Autowired
    private RedevableService redevableService;

    @GetMapping()
    public List<Redevable> searchRedevable() {
        return redevableService.findAll();
    }

    @PostMapping()
    public Redevable addRedevable(@RequestBody Redevable redevable) {
        return redevableService.addRedevable(redevable);
    }
}
