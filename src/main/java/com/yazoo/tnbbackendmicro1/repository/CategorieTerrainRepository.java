package com.yazoo.tnbbackendmicro1.repository;

import com.yazoo.tnbbackendmicro1.model.CategorieTerrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieTerrainRepository extends JpaRepository<CategorieTerrain, Long> {

    CategorieTerrain findByNomCategorie(String nomCategorie);
}
