package com.example.Practice.Springboot.APIs6;

public class Product {
    private int ID;
    private String name;
    private int stockQuantity;

    // Constructor

    public Product(int ID, String name, int stockQuantity) {
        this.ID = ID;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    //Getter and Setter

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
