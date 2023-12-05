package com.yazoo.tnbbackendmicro1.service;


import com.yazoo.tnbbackendmicro1.model.CategorieTerrain;
import com.yazoo.tnbbackendmicro1.repository.CategorieTerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieTerrainService {

    @Autowired
    private CategorieTerrainRepository categorieTerrainRepository;

    public CategorieTerrain findByNomCategorie(String nomCategorie) {
        return categorieTerrainRepository.findByNomCategorie(nomCategorie);
    }

    public List<CategorieTerrain> findAll() {
        return categorieTerrainRepository.findAll();
    }

    public <S extends CategorieTerrain> S addCategorie(S entity) {
        return categorieTerrainRepository.save(entity);
    }

    public Optional<CategorieTerrain> findById(Long aLong) {
        return categorieTerrainRepository.findById(aLong);
    }

    public void deleteCategorie(Long aLong) {
        categorieTerrainRepository.deleteById(aLong);
    }
}
