
package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.Domain.Agence;
import tn.esprit.autoloc.Domain.Employe;
import tn.esprit.autoloc.repository.IAgenceRepository;
import tn.esprit.autoloc.repository.IEmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmploye {

    private final IEmployeRepository employeRepository;
    private final IAgenceRepository agenceRepository;

    @Override
    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye)
                .orElseThrow(() -> new RuntimeException("Employe introuvable"));

        employe.setAgence(null);

        return employeRepository.save(employe);
    }

    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye)
                .orElseThrow(() -> new RuntimeException("Employe introuvable"));

        if (employe.getAgence() != null) {
            throw new RuntimeException("L'employe est deja affecte a une agence. Desaffectez-le d'abord.");
        }

        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable"));

        employe.setAgence(agence);

        return employeRepository.save(employe);
    }
}
