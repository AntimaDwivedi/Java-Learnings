package org.example;

public class Bike extends Vehicle {
    // Vehicle is a parent class here and In order to extend the parent class we use "extends" keyword.
    private String handle;

    public Bike(String engine, int wheels, int fuelTank, int seats, String lights, String handle) {
        super(engine, wheels, fuelTank, seats, lights);
        // super method is nothing but a special method which will actually pass these particular values (engine, wheels, fuelTank, seats, lights) to the constructor of parent class.
        this.handle = handle;
    }

    public Bike() {
        handle = "Short";
    }

    @Override   // It shows that we have a similar method in parent class too.
    public String run(){
        return "Running Bike";
    }


// To string is the method which will help us to directly print the information of the object.
//    @Override
//    public String toString() {
//        return "Bike{" +
//                "handle='" + handle + '\'' +
//                '}';
//    }

    public String getHandle() {
        return handle;
    }

    //In order to print the properties of parent class and to use the toString method of parent class too,we will use ToString method  concatenated with super method.
    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();


    }
}