package com.syncretis;

public class Main {

    public static void main(String[] args) {
        RegistrationService register = new RegistrationService();
        DishMenu menu = new DishMenu();

        menu.getMenu();

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

        register.registerClient(client1);
        register.registerClient(client1);
        register.registerClient(client1);
        register.registerClient(client2);
        register.registerClient(client3);
        register.registerClient(client4);
        register.registerClient(client5);
        register.registerClient(client6);
        register.registerClient(client7);
        register.registerClient(client8);
        register.registerClient(client9);
        register.registerClient(client10);
        register.registerClient(client11);

        Client client12 = new Client(8_946_378_48_42L, "Anton", "Solnechnaya 2");
        register.getClients().update(client12, 8_747_546_12_94L, "Anton", "Pirogova 56A");

        register.getClients().remove(client11);
        register.getClients().remove(client10);
        register.getClients().remove(client1);

        OrderList or = new OrderList();
        Order order1 = new Order(client4, menu.getDishByIndex(1 ,2, 3));
        Order order2 = new Order(client4, menu.getDishByIndex(4,5));
        or.add(order1);
        or.add(order2);
        or.getOrdersByClient(client4);

        /*for (int i = 0; i < register.getClients().length(); i++) {
            System.out.println(register.getClients().get(i).toString());
        }*/
    }
}
