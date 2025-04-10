package com.example.beans;

public class Vehicle {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from the Vehicle Bean created by using @Component annotation.");
    }
}
