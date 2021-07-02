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

    public void getOrdersByClient(Client c) {

    }
}
