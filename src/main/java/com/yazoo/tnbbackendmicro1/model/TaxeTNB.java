package com.yazoo.tnbbackendmicro1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TaxeTNB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double tauxTerrain;

    private int annee;

    @OneToOne
    @JoinColumn(name = "terrain_id")
    private Terrain terrain;
}
