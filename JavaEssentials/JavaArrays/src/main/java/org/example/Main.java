package org.example;

public class Main {
    public static void main(String[] args) {


        //First method of array initialization
        String[] names = {"Concepts", "of", "java", "array"};
        System.out.println(names); // [Ljava.lang.String;@15aeb7ab  ,it's the base address  of particular array.

        //Second method of array initialization
        String[] teams;
        teams = new String[10];
        teams[0] = "Rohit";
        teams[3] = "Virat";

        System.out.println(teams[5]); // null (by default array will be initialized to default value of datatype by using which it has been declared)

        int[] numbers;
        numbers = new int[10];

        float[] arr1 = {2.9f, 8.7f, 9};
        System.out.println(arr1[2]); //9.0 (Implicit typecasting)

        double[] arr2 = {9.0, 7.8, 8};
        System.out.println(arr2[2]); //8.0 (Explicit typecasting)

        String[] actors = {"Alia", "Deeplika", "Katrina"};

        //for each loop in java
        for (String actor : actors) {
            System.out.println(actor);
        }

        // Method arguments ,call by value in java
        int value =10;
        Main main = new Main();
        main.displayValue(value); // you have to use static keyword before displayValue method if you don't want to make main object and direct want to call displayValue method.
        System.out.println(value);
        // in Java whenever we are passing a argument to a method ,Value of the variable will be passed only, and if the method manipulates the variable, the impact will be not there in the outside world.

        // call by reference in Java
         String[] games = {"Cricket" ,"Football" ,"Tennis","Badminton"};
         System.out.println(games);// [Ljava.lang.String;@1d81eb93
         System.out.println(main.displayGames(games)); // [Ljava.lang.String;@1d81eb93
         // Both the objects are pointing to same memory location,that's why we are getting same address.
        System.out.println(games[0]);
        main.displayGames2(games);
        System.out.println(games[0]);
        //If we change the value of first index of games array in method definition, the value  will be  changed  for original array too as both are pointing to same memory location.

    }
       void displayValue(int value)
        {
           System.out.println("Value of variable in method value " + value);
           value =20;
           System.out.println("Value of variable in method value " + value);

        }
    String[] displayGames(String[] games)
    {
        return games; //[Ljava.lang.String;@1d81eb93
    }

    String[] displayGames2(String[] games)
    {
        games[0] ="Chess";
        System.out.println(games[0]);
        return games; //[Ljava.lang.String;@1d81eb93
    }

}

// Issues with arrays
// Array is a collection of same type of entities.
// One major issue with an array is that the size of the array is fixed.
// Once an array is declared,its size can neither be increased nor decreased.
//Solution of the problem is Arraylist