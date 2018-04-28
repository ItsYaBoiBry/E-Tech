package com.etechnologycentre.com.myapplication;

import java.io.Serializable;

public class Food implements Serializable {
    private String name, description, price;
    private int url;

    public Food(String name, String description, String price, int url) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }
}
