package com.syncretis;

public class RegistrationService {
    private ClientSet clients = new ClientSet();

    public void registerClient(Client c) {
        clients.add(c);
    }

    public ClientSet getClients() {
        return clients;
    }
}
