package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Domain.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}