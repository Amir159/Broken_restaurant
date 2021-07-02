package com.syncretis;

public class RegistrationService {
    private ClientSet clients = new ClientSet();

    public void RegisterClient(Client c) {
        clients.add(c);
    }

    public ClientSet getClients() { return clients; }
}
