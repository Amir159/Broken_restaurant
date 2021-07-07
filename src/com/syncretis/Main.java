package com.syncretis;

import com.syncretis.client.RegistrationService;
import com.syncretis.dish.DishMenu;
import com.syncretis.order.Order;
import com.syncretis.order.OrderService;

public class Main {

    public static void main(String[] args) {
        RegistrationService register = new RegistrationService();
        OrderService order = new OrderService();
        DishMenu menu = new DishMenu();

        register.registerClient(8_946_321_48_96L, "Pavel", "Sibirskaya 188");
        register.registerClient(8_946_321_48_96L, "Pavel", "Sibirskaya 188");
        register.registerClient(8_946_322_45_45L, "Alexandr", "Lenina 8");
        register.registerClient(8_946_254_48_32L, "Alexey", "Kirova 15");
        register.registerClient(8_946_378_48_01L, "Maxim", "Sorokina 49");
        register.registerClient(8_946_378_48_42L, "Anton", "Solnechnaya 2");
        register.registerClient(8_946_378_48_34L, "Anastasia", "Pushkina 99");
        register.registerClient(8_946_378_48_94L, "Maria", "Uchebnaya 11");
        register.registerClient(8_946_378_48_45L, "Tatyana", "Vershinina 8");
        register.registerClient(8_946_378_48_54L, "Nikolai", "Nahimova 30A");
        register.registerClient(8_946_378_48_09L, "Georgy", "Sovetskaya 10");
        register.registerClient(8_946_378_48_07L, "Vladimir", "Krasnoarmeiskaya 159");

        menu.getMenu();

        register.getClients().update(8_946_378_48_42L, 8_946_321_45_45L, "Anton", "Pirogova 56A");

        register.getClients().remove(8_946_378_48_07L);
        register.getClients().remove(8_946_321_48_96L);
        register.getClients().remove(8_946_321_48_96L);
        for (int i = 0; i < register.getClients().length(); i++) {
            System.out.println(register.getClients().get(i).toString());
        }

        Order order1 = new Order(register.getClients(), 8_946_321_45_45L, menu.getDishByIndex(1, 2, 3));
        Order order2 = new Order(register.getClients(), 8_946_321_45_45L, menu.getDishByIndex(4, 5));
        order.createOrder(order1);
        order.createOrder(order2);
        order.getOrders().getOrdersByClient(8_946_321_45_45L);

        order.getOrders().getOrdersByStatus(Status.CREATED);
    }
}
