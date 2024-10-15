package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    BlocRepository BlocRepository;
    public List<Bloc> retrieveAllBlocs() {
        return BlocRepository.findAll();
    }
    public Bloc retrieveBloc(Long BlocId) {
        return BlocRepository.findById(BlocId).get();
    }
    public Bloc addBloc(Bloc c) {
        return BlocRepository.save(c);
    }
    public void removeBloc(Long BlocId) {
        BlocRepository.deleteById(BlocId);
    }
    public Bloc modifyBloc(Bloc Bloc) {
        return BlocRepository.save(Bloc);
    }
}