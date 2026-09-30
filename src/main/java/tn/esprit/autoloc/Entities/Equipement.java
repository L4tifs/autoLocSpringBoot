package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

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
}