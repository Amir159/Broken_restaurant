package com.syncretis;

import java.util.Objects;

public class Client {
    private String name, address;
    private long phoneNumber;

    public Client(long phoneNumber, String name, String address) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public String get() {
        return "Client:\n\tName: " + name + "\n\tPhone number: " + phoneNumber + "\n\tAddress: " + address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (Objects.hash(o) != Objects.hash(this)) { return false; }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return phoneNumber == client.phoneNumber;
    }
}
