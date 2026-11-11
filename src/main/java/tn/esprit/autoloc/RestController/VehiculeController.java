package tn.esprit.autoloc.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Domain.Vehicule;
import tn.esprit.autoloc.Services.IVehicule;

import java.util.List;

@Tag(name="gestion Vehicule")

@RestController
@RequestMapping("/api/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private final IVehicule vehiculeService;
    @Operation(description = "ajouter Vehicule")

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }
    @PutMapping("/affecter/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(
            @PathVariable Long idVehicule,
            @PathVariable Long idAgence) {

        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }

    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}