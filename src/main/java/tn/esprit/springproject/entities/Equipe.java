package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom ;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Projet> projets;
}
