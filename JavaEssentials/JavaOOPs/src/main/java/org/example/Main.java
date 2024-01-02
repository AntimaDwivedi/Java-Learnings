package org.example;

public class Main {
    public static void main(String[] args) {

        int x;
        Car1 car = new Car1();

        //System.out.println(x);
        //Instance variables have some default values ,but regular variables have no concepts as such.
        //That's  why even if we are not initializing "car.speed" java is giving default value of int type variable which is 0 and giving error in case of x.
        System.out.println(car.speed);

        Car2 car2 = new Car2();
        //car2.run();
         // --> method will give below error if you haven't set the values of member variables.
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.doors" is null
//        at org.example.Car2.run(Car2.java:47)
//        at org.example.Main.main(Main.java:14)
//       Reason --> we are trying to compare doors default value that is "null" with "closed".
//       In Java, we cannot compare null with a value.Null is pointing toNowhere.
//       To make it work ,we will set values for these string variables.


        car2.setDoors("closed");
        car2.setDriver("seated");
        car2.setEngine("on");
        car2.setSpeed(100);
        System.out.println(car2.getSpeed());
        System.out.println("Car 2 running status is " + car2.run());


        Car3 car3 = new Car3();
        Car3 obj3 = new Car3("Closed" ,"off" ,"seated" ,40);
        System.out.println("Car 3 running status is " + car3.run());
        System.out.println("Car 3 running status is " + obj3.run());


        SmartPhone phone = new SmartPhone("apple");
        System.out.println("Brand name of your phone is " + phone.getBrandname());

    }
}