package org.example;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        //We are able to access engine variable of class Vehicle as Bike class extends Vehicle class and engine variable is of public type.
        bike.engine = "petrol";
        System.out.println(bike.getHandle());
        System.out.println(bike.engine);

    }
}