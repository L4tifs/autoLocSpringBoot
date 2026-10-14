package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Paiement;
import java.util.List;

public interface IPaiement {
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiements();
    Paiement getPaiementById(Long id);
}