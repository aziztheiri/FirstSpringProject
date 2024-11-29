package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.ProjetDetail;

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {
}
