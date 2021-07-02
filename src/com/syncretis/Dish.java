package com.syncretis;

public class Dish {
    private String name;
    private int cost;

    public Dish(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return "Dish name: " + name + "\tCost: " + cost;
    }

}
