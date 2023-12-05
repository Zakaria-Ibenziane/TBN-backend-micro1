package com.yazoo.tnbbackendmicro1.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long terrainID;

    private double surface;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieTerrain categorie;

    @OneToOne(mappedBy = "terrain")
    private TaxeTNB taxeTNB;

    @ManyToOne
    @JoinColumn(name = "proprietaire_cin")
    private Redevable proprietaire;


}
