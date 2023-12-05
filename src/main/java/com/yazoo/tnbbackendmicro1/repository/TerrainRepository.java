package com.yazoo.tnbbackendmicro1.repository;

import com.yazoo.tnbbackendmicro1.model.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Long> {

    List<Terrain> findByProprietaireCIN(String CIN);
}
