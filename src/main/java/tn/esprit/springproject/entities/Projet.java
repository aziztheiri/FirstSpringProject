package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet ;
    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets")
    @JsonIgnore
    @ToString.Exclude
    private List<Equipe> equipes;
}
