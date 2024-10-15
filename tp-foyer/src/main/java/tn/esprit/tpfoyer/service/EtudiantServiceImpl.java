package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository EtudiantRepository;
    public List<Etudiant> retrieveAllEtudiants() {
        return EtudiantRepository.findAll();
    }
    public Etudiant retrieveEtudiant(Long EtudiantId) {
        return EtudiantRepository.findById(EtudiantId).get();
    }
    public Etudiant addEtudiant(Etudiant c) {
        return EtudiantRepository.save(c);
    }
    public void removeEtudiant(Long EtudiantId) {
        EtudiantRepository.deleteById(EtudiantId);
    }
    public Etudiant modifyEtudiant(Etudiant Etudiant) {
        return EtudiantRepository.save(Etudiant);
    }
}