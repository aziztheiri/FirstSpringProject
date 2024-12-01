package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long  id ;
    private String description ;
    private String technologie;
    private  Long cout;
    private LocalDate date;
    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "projetDetail")
    private Projet projet;
}
