package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Domain.Client;
import java.util.List;

public interface IClient {

    Client updateClient(Client client);

    void deleteClient(Long id);

    Client addClient(Client client);

    List<Client> getAllClients();

    Client getClientById(Long id);
}