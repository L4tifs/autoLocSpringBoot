package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Agence;
import java.util.List;

public interface IAgence {
    Agence addAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    List<Agence> getAllAgences();
    Agence getAgenceById(Long id);
}