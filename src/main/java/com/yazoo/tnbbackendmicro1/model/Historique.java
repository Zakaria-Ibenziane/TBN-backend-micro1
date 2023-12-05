package com.yazoo.tnbbackendmicro1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int annee;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieTerrain categorie;
}
