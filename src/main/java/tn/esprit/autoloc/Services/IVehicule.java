package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Vehicule;
import java.util.List;

public interface IVehicule {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
    Vehicule getVehiculeById(Long id);
}