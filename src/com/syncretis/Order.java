package com.syncretis;

public class Order {
    private Dish[] dishes;
    Status status;
    Client client;

    public Order(Client client) {
        this.status = Status.CREATED;
        this.client = client;
        this.dishes = new Dish[10];
    }
}
