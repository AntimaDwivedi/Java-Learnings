package org.example;

public class Bike extends Vehicle {
// Vehicle is a parent class here and In order to extend the parent class we use "extends" keyword.
 private String handle;

    public Bike() {
        handle = "Short";
    }

    public String getHandle() {
        return handle;
    }
}
