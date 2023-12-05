package com.yazoo.tnbbackendmicro1.controller;


import com.yazoo.tnbbackendmicro1.model.TaxeTNB;
import com.yazoo.tnbbackendmicro1.service.TaxeTNBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxes")
public class TaxeTNBController {

    @Autowired
    private TaxeTNBService taxeTNBService;

    @GetMapping()
    public List<TaxeTNB> searchTaxe(@RequestParam int annee, @RequestParam String CIN) {
        return taxeTNBService.findByAnneeAndProprietaireCIN(annee, CIN);
    }

    @PostMapping()
    public TaxeTNB addTaxe(@RequestBody TaxeTNB taxeTNB) {
        return taxeTNBService.addTaxe(taxeTNB);
    }
}
