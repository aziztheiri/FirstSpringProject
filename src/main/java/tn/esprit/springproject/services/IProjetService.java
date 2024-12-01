package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Projet;

import java.util.List;

public interface IProjetService {
    public Projet addProjet(Projet projet);

    public Projet updateProjet(Projet projet);

    public List<Projet> retrieveAllProjet();

    public Projet retrieveProjetById(Long idP);

    public void deleteProjetById(Long idP);

    public void affecterProjetDetailAProjet(Long projetId, Long projetDetailId);

    public void affecterProjetAEquipe(Long projetId, Long equipeId);

    public Projet ajouterProjetEtAffecterProjetDetail(Projet projet, Long projetDetailId);

    public Projet DesaffecterProjetDetailDeProjet(Long projetId);

    public void desaffecterProjetDeEquipe(Long projetId, Long equipeId);
}
