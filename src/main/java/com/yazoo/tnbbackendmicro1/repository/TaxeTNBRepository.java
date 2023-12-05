package com.yazoo.tnbbackendmicro1.repository;

import com.yazoo.tnbbackendmicro1.model.TaxeTNB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxeTNBRepository extends JpaRepository<TaxeTNB, Long> {

    List<TaxeTNB> findByAnneeAndTerrain_Proprietaire_CIN(int annee, String CIN);
}
