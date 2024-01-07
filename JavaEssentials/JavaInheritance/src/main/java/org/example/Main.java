package org.example;

public class Main {


    public static void main(String[] args) {

        Bike bike = new Bike();
        //We are able to access engine variable of class Vehicle as Bike class extends Vehicle class and engine variable is of public type.
        bike.engine = "petrol";
        System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());

        Bike bike2 = new Bike("petrol", 2, 21, 4, "LED", "long");
        System.out.println(bike2);//Here ToString method of bike class  is getting used.
        //Whenever we have same method in child class and parent class ,child class will always win.
        System.out.println(bike2.run());

    }

}