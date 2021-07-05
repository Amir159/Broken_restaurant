package com.syncretis;

import java.util.Arrays;

public class OrderList {
    private int capacity = 8;
    private int count = 0;
    private Order[] array = new Order[capacity];

    public void add(Order c) {
        if (count == capacity) {
            Order[] arrayCopy = new Order[capacity];
            capacity *= 2;
            arrayCopy = Arrays.copyOf(array, capacity);
            array = Arrays.copyOf(arrayCopy, capacity);
        }
        array[count] = c;
        count++;
    }

    public void getOrdersByClient(long phoneNumber) {
        Client c = new Client(phoneNumber);
        System.out.println(c.toString());
        for (int i = 0; i < count; i++) {
            if (array[i].getClient().equals(c)) {
                System.out.println(array[i].toString());
            }
        }
    }

    public void getOrdersByStatus(Status status) {
        System.out.println("Status: " + status);
        for (int i = 0; i < count; i++) {
            if (array[i].getStatus().equals(status)) {
                System.out.println(array[i].toString());
            }
        }
    }
}
