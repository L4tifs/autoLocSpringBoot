package tn.esprit.autoloc.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAgence;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 100)
    private String adresse;

    @Column(nullable = false, length = 20)
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}