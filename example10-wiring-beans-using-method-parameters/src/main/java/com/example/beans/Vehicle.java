package com.example.beans;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name - " + name;
    }

}
