package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Employe;
import java.util.List;

public interface IEmploye {
    Employe addEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long id);
    List<Employe> getAllEmployes();
    Employe getEmployeById(Long id);
}