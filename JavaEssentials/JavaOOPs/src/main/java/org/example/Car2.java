package org.example;

public class Car2 {

    private String doors;

    private String engine;

    private String driver;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


    public String getDoors() {
        return doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    private int speed;

    public String run() {
        if (doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed > 0) {
           return "running";
        }
        else{
             return "Not running";
        }
    }


}
