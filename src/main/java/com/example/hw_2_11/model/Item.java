package com.example.hw_2_11.model;


public class Item {
    private final int id;
    private final String title;
    private final double price;

    public Item(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
