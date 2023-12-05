package com.yazoo.tnbbackendmicro1.repository;

import com.yazoo.tnbbackendmicro1.model.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedevableRepository extends JpaRepository<Redevable, Long> {

    List<Redevable> findByNomAndPrenom(String nom, String prenom);
}
