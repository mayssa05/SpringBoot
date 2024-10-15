package tn.esprit.tpfoyer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
/*ou bien
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository ( pagination et tri );*/
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

}
