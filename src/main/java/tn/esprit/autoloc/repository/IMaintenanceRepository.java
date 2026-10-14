package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Domain.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {
}