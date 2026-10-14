package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Reservation;
import java.util.List;

public interface IReservation {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long id);
}