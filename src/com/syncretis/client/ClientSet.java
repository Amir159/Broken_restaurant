package com.syncretis.client;

import java.util.Arrays;

public class ClientSet {
    private int capacity = 8;
    private int count = 0;
    private Client[] array = new Client[capacity];

    public void add(Client c) {
        if (count == capacity) {
            Client[] arrayCopy = Arrays.copyOf(array, capacity *= 2);
            array = arrayCopy;
        }
        
        if (!contain(c.getPhoneNumber())) {
            array[count] = c;
            count++;
        }
    }

    public void remove(long phoneNumber) {
        int clientPosition = find(phoneNumber);
        if (clientPosition == capacity - 1) {
            array[clientPosition] = null;
            count--;
        } else if (clientPosition != -1) {
            for (int i = clientPosition; i < count - 1; i++) {
                array[i] = array[i + 1];
                array[i+1] = null;
            }
            count--;
        }
    }

    public void update(long phoneNumber, long newPhoneNumber, String newName, String newAddress) {
        int clientPosition = find(phoneNumber);
        if (clientPosition != -1) {
            array[clientPosition].setPhoneNumber(newPhoneNumber);
            array[clientPosition].setName(newName);
            array[clientPosition].setAddress(newAddress);
        }
    }

    public int find(long phoneNumber) {
        Client c = new Client(phoneNumber, "Unnamed", "None");
        for (int i = 0; i < count; i++) {
            if (array[i].hashCode() != c.hashCode()) {
                continue;
            }
            if (array[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contain(long phoneNumber) {
        Client c = new Client(phoneNumber, "Unnamed", "None");
        for (int i = 0; i < count; i++) {
            if (array[i].hashCode() != c.hashCode()) {
                continue;
            }
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
