package tn.esprit.autoloc.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEquipement;

    @Column(nullable = false, length = 100)
    private String libelle;

    @ManyToMany(mappedBy = "equipements")
    @JsonIgnore
    private List<Vehicule> vehicules;
}