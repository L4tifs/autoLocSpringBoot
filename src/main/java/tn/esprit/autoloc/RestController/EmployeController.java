package tn.esprit.autoloc.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Domain.Employe;
import tn.esprit.autoloc.Services.IEmploye;

import java.util.List;

@RestController
@Tag(name="gestion employe")
@RequestMapping("/api/employes")
@AllArgsConstructor
public class EmployeController {

    private final IEmploye employeService;
    @Operation(description = "ajouter employe")
    @PostMapping
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }
    @PutMapping("/desaffecter/{idEmploye}")
    public Employe desaffecterEmploye(
            @PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecter/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(
            @PathVariable Long idEmploye,
            @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}