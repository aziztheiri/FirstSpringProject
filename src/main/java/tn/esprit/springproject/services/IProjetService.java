package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Projet;

import java.util.List;

public interface IProjetService {
    public Projet addProjet(Projet projet);
    public Projet updateProjet(Projet projet);
    public List<Projet> retrieveAllProjet();
    public Projet retrieveProjetById(String idP);
    public void deleteProjetById(String idP);
}
