package com.yazoo.tnbbackendmicro1.service;


import com.yazoo.tnbbackendmicro1.model.TaxeTNB;
import com.yazoo.tnbbackendmicro1.repository.TaxeTNBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxeTNBService {

    @Autowired
    private TaxeTNBRepository taxeTNBRepository;

    public <S extends TaxeTNB> List<S> findAll(Example<S> example, Sort sort) {
        return taxeTNBRepository.findAll(example, sort);
    }

    public List<TaxeTNB> findAll() {
        return taxeTNBRepository.findAll();
    }

    public <S extends TaxeTNB> S addTaxe(S entity) {
        return taxeTNBRepository.save(entity);
    }

    public Optional<TaxeTNB> findById(Long aLong) {
        return taxeTNBRepository.findById(aLong);
    }

    public void deleteTaxe(Long aLong) {
        taxeTNBRepository.deleteById(aLong);
    }

    public List<TaxeTNB> findByAnneeAndProprietaireCIN(int annee, String cin) {
        return taxeTNBRepository.findByAnneeAndTerrain_Proprietaire_CIN(annee,cin);
    }
}
