package com.syncretis.order;

import com.syncretis.Status;
import com.syncretis.client.Client;

import java.util.Arrays;

public class OrderList {
    private int capacity = 8;
    private int count = 0;
    private Order[] array = new Order[capacity];

    public void add(Order c) {
        if (count == capacity) {
            Order[] arrayCopy = Arrays.copyOf(array, capacity *= 2);
            array = arrayCopy;
        }

        array[count] = c;
        count++;

    }

    public void getOrdersByClient(long phoneNumber) {
        Client c = new Client(phoneNumber);
        for (int i = 0; i < count; i++) {
            if (array[i].getClient().equals(c)) {
                System.out.println(array[i].getClient().toString());
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
