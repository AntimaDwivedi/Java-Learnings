package org.example;

public class Car3 {

    private String doors;
    private String engines;

    private String driver;

    private int speed;


    //User-defined constructor
    //Type-1 Constructor
   public Car3() {
        doors = "closed";
        engines = "on";
        driver = "seated";
        speed = 100;
    }

    //Type-2 Constructor
    public Car3(String doors , String engines , String driver ,int speed) {
        this.doors = doors;
        this.engines = engines;
        this.driver = driver;
        this.speed = speed;
    }




    public String run() {
        if (doors.equals("closed") && engines.equals("on")
                && driver.equals("seated") && speed > 0) {
            return "running";
        }
        else{
            return "Not running";
        }
    }



}
