package com.syncretis;

public class Main {

    public static void main(String[] args) {
        RegistrationService register = new RegistrationService();
        Client client1 = new Client(8_946_321_48_96L, "Pavel", "Sibirskaya 188");
        Client client2 = new Client(8_946_321_45_45L, "Alexandr", "Lenina 8");
        Client client3 = new Client(8_946_254_48_32L, "Alexey", "Kirova 15");
        Client client4 = new Client(8_946_378_48_01L, "Maxim", "Sorokina 49");
        Client client5 = new Client(8_946_378_48_42L, "Anton", "Solnechnaya 2");
        Client client6 = new Client(8_946_378_48_34L, "Anastasia", "Pushkina 99");
        Client client7 = new Client(8_946_378_48_94L, "Maria", "Uchebnaya 11");
        Client client8 = new Client(8_946_378_48_45L, "Tatyana", "Vershinina 8");
        Client client9 = new Client(8_946_378_48_54L, "Nikolai", "Nahimova 30A");
        Client client10 = new Client(8_946_378_48_09L, "Georgy", "Sovetskaya 10");
        Client client11 = new Client(8_946_378_48_07L, "Vladimir", "Krasnoarmeiskaya 159");

        register.RegisterClient(client1);
        register.RegisterClient(client1);
        register.RegisterClient(client1);
        register.RegisterClient(client2);
        register.RegisterClient(client3);
        register.RegisterClient(client4);
        register.RegisterClient(client5);
        register.RegisterClient(client6);
        register.RegisterClient(client7);
        register.RegisterClient(client8);
        register.RegisterClient(client9);
        register.RegisterClient(client10);
        register.RegisterClient(client11);

        register.getClients().update(client2, 8_747_546_12_94L, "Sergey", "Pirogova 56A");

        register.getClients().remove(client11);
        for (int i = 0; i < register.getClients().length(); i++) {
            System.out.println(register.getClients().get(i).get());
        }
    }
}
