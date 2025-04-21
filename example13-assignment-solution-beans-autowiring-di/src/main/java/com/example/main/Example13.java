package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] beanNamesForPerson = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);

        String[] beanNamesForVehicle = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("'vehicle' bean is used [vehicle.getVehicleServices()]");
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();

        System.out.println("=========== <> ===========");

        System.out.println("'person' bean is used [person.getVehicle().getVehicleServices()]");
        person.getVehicle().getVehicleServices().playMusic();   //This does the same as Line-18
        person.getVehicle().getVehicleServices().moveVehicle(); //This does the same as Line-19
    }
}
