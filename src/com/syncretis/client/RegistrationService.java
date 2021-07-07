package com.syncretis.client;

public class RegistrationService {
    private ClientSet clients = new ClientSet();

    public void registerClient(long phoneNumber, String name, String address) {
        Client c = new Client(phoneNumber, name, address);
        clients.add(c);
    }

    public ClientSet getClients() {
        return clients;
    }
}
