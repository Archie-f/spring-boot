package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);//This will not print "Person bean created by Spring" text because constructor ıs not generated.
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context : " + person.getName());
        System.out.println("Vehicle name from Spring Context : " + vehicle.getName());
        System.out.println("Vehicle that Person own : " + person.getVehicle());
    }
}
