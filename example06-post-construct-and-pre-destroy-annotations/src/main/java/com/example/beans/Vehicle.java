package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void nameTheVehicle(){
        this.name = "Toyota";
        //setName("Ferrari"); this also works when used instead.
    }

    @PreDestroy
    public void destroy() {
        System.out.println(
                "\"context.close()\" method is used. " +
                        "@PreDestroy annotation is in charge. Destroying Vehicle Bean");
    }

    public void sayHello(){
        System.out.println("Hello from the Vehicle Bean created by using @Component annotation.");
    }
}
