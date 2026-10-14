package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Equipement;
import java.util.List;

public interface IEquipement {
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipements();
    Equipement getEquipementById(Long id);
}