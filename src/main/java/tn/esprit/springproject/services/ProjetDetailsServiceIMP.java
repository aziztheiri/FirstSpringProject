package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.ProjetDetail;
import tn.esprit.springproject.repositories.ProjetDetailRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailsServiceIMP implements IProjetDetailService{
    private ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }
    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> retrieveAllProjetDetail() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retrieveProjetDetailById(Long idPd) {
        return projetDetailRepository.findById(idPd).orElse(null);
    }

    @Override
    public void deleteProjetDetailById(Long idPd) {
        projetDetailRepository.deleteById(idPd);
    }

}
