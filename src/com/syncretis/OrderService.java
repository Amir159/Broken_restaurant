package com.syncretis;

public class OrderService {
    private OrderList order = new OrderList();

    public void createOrder(Order o) {
        order.add(o);
    }

    public OrderList getOrders() {
        return order;
    }
}