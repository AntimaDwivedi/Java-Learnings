package org.example;

public class Vehicle {

    public String engine;
    public int wheels;
    public int fuelTank;
    public int seats;
    public String lights;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public Vehicle(){
        engine = "gas";
        wheels = 2;
        seats = 2;
        fuelTank = 14;
        lights = "LED";

    }


}
