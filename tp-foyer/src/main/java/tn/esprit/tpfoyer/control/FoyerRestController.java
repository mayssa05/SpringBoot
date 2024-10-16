package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Foyer")
public class FoyerRestController {
    IFoyerService FoyerService;

    // http://localhost:8089/tpfoyer/Foyer/retrieve-all-Foyers
    @GetMapping("/retrieve-all-Foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = FoyerService.retrieveAllFoyers();
        return listFoyers;
    }

    // http://localhost:8089/tpfoyer/Foyer/retrieve-Foyer/8
    @GetMapping("/retrieve-Foyer/{Foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("Foyer-id") Long chId) {
        Foyer Foyer = FoyerService.retrieveFoyer(chId);
        return Foyer;
    }

    // http://localhost:8089/tpfoyer/Foyer/add-Foyer
    @PostMapping("/add-Foyer")
    public Foyer addFoyer(@RequestBody Foyer c) {
        Foyer Foyer = FoyerService.addFoyer(c);
        return Foyer;
    }

    // http://localhost:8089/tpfoyer/Foyer/remove-Foyer/5
    @DeleteMapping("/remove-Foyer/{Foyer-id}")
    public void removeFoyer(@PathVariable("Foyer-id") Long chId) {
        FoyerService.removeFoyer(chId);
    }

    // http://localhost:8089/tpfoyer/Foyer/modify-Foyer
    @PutMapping("/modify-Foyer")
    public Foyer modifyFoyer(@RequestBody Foyer c) {
        Foyer Foyer = FoyerService.modifyFoyer(c);
        return Foyer;
    }
}