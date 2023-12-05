package com.yazoo.tnbbackendmicro1.service;


import com.yazoo.tnbbackendmicro1.model.Terrain;
import com.yazoo.tnbbackendmicro1.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {

    @Autowired
    private TerrainRepository terrainRepository;

    public <S extends Terrain> List<S> findAll(Example<S> example, Sort sort) {
        return terrainRepository.findAll(example, sort);
    }

    public List<Terrain> findAll() {
        return terrainRepository.findAll();
    }

    public <S extends Terrain> S addTerrain(S entity) {
        return terrainRepository.save(entity);
    }

    public Optional<Terrain> findById(Long aLong) {
        return terrainRepository.findById(aLong);
    }

    public void deleteTerrain(Long aLong) {
        terrainRepository.deleteById(aLong);
    }
}
