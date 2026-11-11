
package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Domain.Vehicule;
import tn.esprit.autoloc.Domain.Agence;
import tn.esprit.autoloc.Domain.Equipement;
import tn.esprit.autoloc.repository.IAgenceRepository;
import tn.esprit.autoloc.repository.IEquipementRepository;
import tn.esprit.autoloc.repository.IVehiculeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehicule {

    private final IVehiculeRepository vehiculeRepository;
    private final IAgenceRepository agenceRepository;
    private final IEquipementRepository equipementRepository;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    // SCENARIO 2 : Affecter un vehicule a une agence
    @Override
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable"));

        vehicule.setAgence(agence);

        return vehiculeRepository.save(vehicule);
    }

    // SCENARIO 3 : Affecter un equipement a un vehicule
    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable"));

        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new ArrayList<>());
        }

        boolean existe = vehicule.getEquipements().stream()
                .anyMatch(e -> Objects.equals(e.getIdEquipement(), idEquipement));

        if (!existe) {
            vehicule.getEquipements().add(equipement);
        }

        return vehiculeRepository.save(vehicule);
    }

    // SCENARIO 3 : Desaffecter un equipement d'un vehicule
    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable"));

        if (vehicule.getEquipements() != null) {
            vehicule.getEquipements().removeIf(
                    e -> Objects.equals(e.getIdEquipement(), idEquipement)
            );
        }

        return vehiculeRepository.save(vehicule);
    }
}
