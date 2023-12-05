package com.yazoo.tnbbackendmicro1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CategorieTerrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomCategorie;


    private double taux;

    @OneToMany(mappedBy = "categorie",targetEntity = Historique.class)
    private List<Historique> historiques;

}

