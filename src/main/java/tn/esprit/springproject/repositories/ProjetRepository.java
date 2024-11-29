package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Projet;
import tn.esprit.springproject.entities.ProjetDetail;

public interface ProjetRepository extends JpaRepository<Projet, String> {
}
