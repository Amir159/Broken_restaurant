package com.syncretis;

import java.util.Arrays;

public class ClientSet {
    private int capacity = 8;
    private int count = 0;
    private Client[] array = new Client[capacity];

    public void add(Client c) {
        if (count == capacity) {
            //capacity *= 2;
            Client[] arrayCopy = Arrays.copyOf(array, capacity *= 2);
            array = arrayCopy;
        }
        if (!contain(c)) {
            array[count] = c;
            count++;
        }
    }

    public void remove(Client c) {
        int clientPosition = find(c);
        if (clientPosition == capacity - 1) {
            array[clientPosition] = null;
            count--;
        } else if (clientPosition != -1) {
            int j = 0;
            for (int i = clientPosition; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            count--;
        }
    }

    public void update(Client c, long phoneNumber, String name, String address) {
        int clientPosition = find(c);
        if (clientPosition != -1) {
            array[clientPosition].setPhoneNumber(phoneNumber);
            array[clientPosition].setName(name);
            array[clientPosition].setAddress(address);
        }
    }

    public int find(Client c) {
        for (int i = 0; i < count; i++) {
            if (array[i].hashCode() != c.hashCode()) continue;
            if (array[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contain(Client c) {
        for (int i = 0; i < count; i++) {
            if (array[i].hashCode() != c.hashCode()) continue;
            if (array[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    public Client get(int index) {
        return array[index];
    }

    public int length() {
        return count;
    }
}
