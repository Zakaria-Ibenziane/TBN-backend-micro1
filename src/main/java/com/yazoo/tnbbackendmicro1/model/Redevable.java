package com.yazoo.tnbbackendmicro1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Redevable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CIN;

    private String nom;

    private String prenom;

    private String adresse;

    @OneToMany(targetEntity = TaxeTNB.class)
    private List<Terrain> terrains;
}
