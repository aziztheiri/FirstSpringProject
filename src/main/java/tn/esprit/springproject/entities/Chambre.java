package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private Long numC ;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
