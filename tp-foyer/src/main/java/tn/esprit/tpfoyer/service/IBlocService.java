package tn.esprit.tpfoyer.service;
import tn.esprit.tpfoyer.entity.Bloc;
import java.util.List;
public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long BlocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long BlocId);
    public Bloc modifyBloc(Bloc Bloc);




}