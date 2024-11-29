package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Projet;
import tn.esprit.springproject.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    public List<ProjetDetail> retrieveAllProjetDetail();
    public ProjetDetail retrieveProjetDetailById(Long idPd);
    public void deleteProjetDetailById(Long idPd);
}
