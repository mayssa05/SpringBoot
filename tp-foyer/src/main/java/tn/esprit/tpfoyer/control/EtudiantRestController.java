package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantRestController {
    IEtudiantService EtudiantService;

    // http://localhost:8089/tpfoyer/Etudiant/retrieve-all-Etudiants
    @GetMapping("/retrieve-all-Etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = EtudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    // http://localhost:8089/tpfoyer/Etudiant/retrieve-Etudiant/8
    @GetMapping("/retrieve-Etudiant/{Etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("Etudiant-id") Long chId) {
        Etudiant Etudiant = EtudiantService.retrieveEtudiant(chId);
        return Etudiant;
    }

    // http://localhost:8089/tpfoyer/Etudiant/add-Etudiant
    @PostMapping("/add-Etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant c) {
        Etudiant Etudiant = EtudiantService.addEtudiant(c);
        return Etudiant;
    }

    // http://localhost:8089/tpfoyer/Etudiant/remove-Etudiant/5
    @DeleteMapping("/remove-Etudiant/{Etudiant-id}")
    public void removeEtudiant(@PathVariable("Etudiant-id") Long chId) {
        EtudiantService.removeEtudiant(chId);
    }

    // http://localhost:8089/tpfoyer/Etudiant/modify-Etudiant
    @PutMapping("/modify-Etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant c) {
        Etudiant Etudiant = EtudiantService.modifyEtudiant(c);
        return Etudiant;
    }
}