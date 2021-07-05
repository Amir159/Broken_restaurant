package com.syncretis;

public class Dish {
    private String name;
    private int cost;

    public Dish(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        if (name.length() < 8) return name + "\t\t\t" + cost + "rub";
        return name + "\t\t" + cost + "rub";
    }
}
