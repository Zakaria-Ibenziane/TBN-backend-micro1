package com.yazoo.tnbbackendmicro1.service;

import com.yazoo.tnbbackendmicro1.model.Historique;
import com.yazoo.tnbbackendmicro1.repository.HistoriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriqueService {

    @Autowired
    private HistoriqueRepository historiqueRepository;

    public <S extends Historique> List<S> findAll(Example<S> example, Sort sort) {
        return historiqueRepository.findAll(example, sort);
    }

    public List<Historique> findAll() {
        return historiqueRepository.findAll();
    }

    public <S extends Historique> S addHistorique(S entity) {
        return historiqueRepository.save(entity);
    }

    public Optional<Historique> findById(Long aLong) {
        return historiqueRepository.findById(aLong);
    }

    public void deleteHistorique(Long aLong) {
        historiqueRepository.deleteById(aLong);
    }

    public List<Historique> findByNomCategorie(String nomCategorie) {
        return historiqueRepository.findByCategorie_NomCategorie(nomCategorie);
    }
}
