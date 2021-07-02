package com.syncretis;

import java.util.Arrays;

public class ClientSet {
    private int capacity = 8;
    private int count = 0;
    private Client[] array = new Client[capacity];

    public void add(Client c) {
        if (count == capacity) {
            Client[] arrayCopy = new Client[capacity];
            capacity *= 2;
            arrayCopy = Arrays.copyOf(array, capacity);
            array = Arrays.copyOf(arrayCopy, capacity);
        }
        if (!contain(c)) {
            array[count] = c;
            count++;
        }
    }

    public void remove(Client c) {
        Client[] arrayCopy = new Client[capacity];
        int clientPosition = find(c);
        if (clientPosition != -1) {
            int j = 0;
            for (int i = 0; i < count; i++) {
                if (i != clientPosition) {
                    arrayCopy[j] = array[i];
                    j++;
                }
            }
            array = Arrays.copyOf(arrayCopy, capacity);
            count--;
        }
    }

    public void update(Client c, long phoneNumber, String name, String address) {
        c.setPhoneNumber(phoneNumber);
        c.setName(name);
        c.setAddress(address);
    }

    public int find(Client c) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contain(Client c) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    public Client get(int index) { return array[index]; }

    public int length() { return count; }
}
