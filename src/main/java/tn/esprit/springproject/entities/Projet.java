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
public class Projet {
    @Id
    private String id ;
    private String sujet ;
    @OneToOne
    private ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets")
    private List<Equipe> equipes;
}
