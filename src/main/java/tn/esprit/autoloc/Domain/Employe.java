package tn.esprit.autoloc.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmploye;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoleEmploye role;

    @ManyToOne
    @JsonIgnore

    @JoinColumn(name = "id_agence", nullable = true)
    private Agence agence;
}