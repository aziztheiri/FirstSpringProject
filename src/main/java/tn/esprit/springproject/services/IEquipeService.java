package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public Equipe addEquipe(Equipe equipe);
    public Equipe updateEquipe(Equipe equipe);
    public List<Equipe> retrieveAllEquipe();
    public Equipe retrieveEquipeById(Integer idE);
    public void deleteEquipeById(Integer idE);
}
