package tn.esprit.autoloc.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Domain.Maintenance;
import tn.esprit.autoloc.Services.IMaintenance;

import java.util.List;

@Tag(name="gestion maienantance")
@RestController
@RequestMapping("/api/maintenances")
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenance maintenanceService;
    @Operation(description = "ajouter maintenance")

    @PostMapping
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }
}