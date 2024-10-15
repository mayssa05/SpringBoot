package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
   //private Object Accesslevel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Foyer> foyers ;

}
