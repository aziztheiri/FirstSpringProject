package tn.esprit.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Reservation implements Serializable {
    @Id
    private String idR ;
    private Date anneeUniv ;
    private Boolean estValide ;

}
