package org.example;

public class Main {
    private int i =55;   // Global variable
    public static void main(String[] args) {
        {
            int i =100;
            System.out.println(i);
        }
        System.out.println("*************************");
        System.out.println(new Main().i);

        //whenever we have a method inside a method, we cannot repeat the name of the variable, which is a generic rule.
        //A class level variable or a global variable can have a same name.
        //A method level variable and a class level variable can have same name but in a method we cannot have duplicate variable names.

    }
}