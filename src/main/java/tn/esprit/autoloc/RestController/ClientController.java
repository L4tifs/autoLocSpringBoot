package tn.esprit.autoloc.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IClient;
import tn.esprit.autoloc.Domain.Client;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final IClient clientService;

    public ClientController(IClient iClient) {
        clientService = iClient;
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
}