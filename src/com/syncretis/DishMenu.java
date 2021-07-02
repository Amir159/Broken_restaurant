package com.syncretis;

public class DishMenu {
    private Dish[] dishes = new Dish[9];

    public DishMenu() {
        dishes[0] = new Dish("Cesar salad", 179);
        dishes[1] = new Dish("Greek salad", 139);
        dishes[2] = new Dish("Cheese soup ", 179);
        dishes[3] = new Dish("Pea soup", 169);
        dishes[4] = new Dish("Borscht", 149);
        dishes[5] = new Dish("Steak", 679);
        dishes[6] = new Dish("Barbecue", 309);
        dishes[7] = new Dish("Pilaf", 189);
        dishes[8] = new Dish("Tiramisu", 659);
    }

    public void getMenu() {
        for (Dish dish : dishes) {
            System.out.println(dish.toString());
        }
    }
}
