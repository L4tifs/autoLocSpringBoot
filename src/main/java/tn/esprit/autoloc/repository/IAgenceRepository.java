package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Domain.Agence;

public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}