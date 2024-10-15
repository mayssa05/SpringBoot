package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Bloc")
public class BlocRestController {
    IBlocService BlocService;

    // http://localhost:8089/tpfoyer/Bloc/retrieve-all-Blocs
    @GetMapping("/retrieve-all-Blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = BlocService.retrieveAllBlocs();
        return listBlocs;
    }

    // http://localhost:8089/tpfoyer/Bloc/retrieve-Bloc/8
    @GetMapping("/retrieve-Bloc/{Bloc-id}")
    public Bloc retrieveBloc(@PathVariable("Bloc-id") Long chId) {
        Bloc Bloc = BlocService.retrieveBloc(chId);
        return Bloc;
    }

    // http://localhost:8089/tpfoyer/Bloc/add-Bloc
    @PostMapping("/add-Bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc Bloc = BlocService.addBloc(c);
        return Bloc;
    }

    // http://localhost:8089/tpfoyer/Bloc/remove-Bloc/5
    @DeleteMapping("/remove-Bloc/{Bloc-id}")
    public void removeBloc(@PathVariable("Bloc-id") Long chId) {
        BlocService.removeBloc(chId);
    }

    // http://localhost:8089/tpfoyer/Bloc/modify-Bloc
    @PutMapping("/modify-Bloc")
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc Bloc = BlocService.modifyBloc(c);
        return Bloc;
    }
}