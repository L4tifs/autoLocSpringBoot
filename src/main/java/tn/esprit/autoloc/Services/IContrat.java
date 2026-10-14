package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Contrat;
import java.util.List;

public interface IContrat {
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long id);
    List<Contrat> getAllContrats();
    Contrat getContratById(Long id);
}