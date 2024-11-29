package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.repositories.EquipeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipeServiceIMP implements IEquipeService{
    private EquipeRepository equipeRepository;
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipeById(Integer idE) {
        return equipeRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEquipeById(Integer idE) {
        equipeRepository.deleteById(idE);
    }
}
