package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
