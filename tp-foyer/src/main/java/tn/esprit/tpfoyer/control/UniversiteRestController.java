package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Universite")
public class UniversiteRestController {
    IUniversiteService UniversiteService;

    // http://localhost:8089/tpfoyer/Universite/retrieve-all-Universites
    @GetMapping("/retrieve-all-Universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = UniversiteService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8089/tpfoyer/Universite/retrieve-Universite/8
    @GetMapping("/retrieve-Universite/{Universite-id}")
    public Universite retrieveUniversite(@PathVariable("Universite-id") Long chId) {
        Universite Universite = UniversiteService.retrieveUniversite(chId);
        return Universite;
    }

    // http://localhost:8089/tpfoyer/Universite/add-Universite
    @PostMapping("/add-Universite")
    public Universite addUniversite(@RequestBody Universite c) {
        Universite Universite = UniversiteService.addUniversite(c);
        return Universite;
    }

    // http://localhost:8089/tpfoyer/Universite/remove-Universite/5
    @DeleteMapping("/remove-Universite/{Universite-id}")
    public void removeUniversite(@PathVariable("Universite-id") Long chId) {
        UniversiteService.removeUniversite(chId);
    }

    // http://localhost:8089/tpfoyer/Universite/modify-Universite
    @PutMapping("/modify-Universite")
    public Universite modifyUniversite(@RequestBody Universite c) {
        Universite Universite = UniversiteService.modifyUniversite(c);
        return Universite;
    }
}