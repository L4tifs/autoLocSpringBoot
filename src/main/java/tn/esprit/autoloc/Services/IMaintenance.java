package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Maintenance;
import java.util.List;

public interface IMaintenance {
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
    Maintenance getMaintenanceById(Long id);
}