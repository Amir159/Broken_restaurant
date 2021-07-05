package com.syncretis;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private Dish[] dishes;
    private Status status;
    private Client client;

    public Order(ClientSet clientSet, long phoneNumber, Dish[] dish) {
        this.status = Status.CREATED;
        Client c = new Client(phoneNumber);
        for (int i = 0; i < clientSet.length(); i++) {
            if (clientSet.get(i).hashCode() == c.hashCode()) {
                this.client = clientSet.get(i);
            }
        }
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
