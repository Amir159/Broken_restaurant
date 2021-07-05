package com.syncretis;

import java.util.Arrays;

public class Order {
    private Dish[] dishes;
    private Status status;
    private Client client;

    public Order(Client client, Dish[] dish) {
        this.status = Status.CREATED;
        this.client = client;
        this.dishes = new Dish[dish.length];
        for (int i = 0; i < dish.length; i++) {
            dishes[i] = dish[i];
        }
    }

    public Client getClient() {
        return client;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        DishMenu menu = new DishMenu();
        int total = 0;
        for (Dish it : dishes) {
            total += it.getCost();
        }
        return "Order:\n\t" + Arrays.toString(dishes) + "\n\t[Total " + total + "rub]\n\tStatus: " + status;
    }
}
