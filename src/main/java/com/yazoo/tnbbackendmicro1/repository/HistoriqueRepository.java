package com.yazoo.tnbbackendmicro1.repository;

import com.yazoo.tnbbackendmicro1.model.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoriqueRepository extends JpaRepository<Historique, Long> {

    List<Historique> findByCategorie_NomCategorie(String nomCategorie);
}
