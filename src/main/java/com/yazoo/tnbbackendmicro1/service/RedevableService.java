package com.yazoo.tnbbackendmicro1.service;

import com.yazoo.tnbbackendmicro1.model.Redevable;
import com.yazoo.tnbbackendmicro1.repository.RedevableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedevableService {

    @Autowired
    private RedevableRepository redevableRepository;

    public List<Redevable> findByNomAndPrenom(String nom, String prenom) {
        return redevableRepository.findByNomAndPrenom(nom, prenom);
    }

    public List<Redevable> findAll() {
        return redevableRepository.findAll();
    }

    public <S extends Redevable> S addRedevable(S entity) {
        return redevableRepository.save(entity);
    }

    public Optional<Redevable> findById(Long aLong) {
        return redevableRepository.findById(aLong);
    }

    public void deleteByRedevable(Long aLong) {
        redevableRepository.deleteById(aLong);
    }
}
