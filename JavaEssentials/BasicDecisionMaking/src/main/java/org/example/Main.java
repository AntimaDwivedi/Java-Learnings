package org.example;

public class Main {
    public static void main(String[] args) {
        // + operator (overloaded operator)
        //Operator and their precedence
        // mod
        //Post Increment
        //Pre Increment

        // AND operator --> &&
        //OR operator --> ||
        boolean x = true;
        boolean y = false;
        int a = 1;
        int b = 0;

        if (x && y)
            System.out.println("Condition is true");
        else
            System.out.println("Condition is false");
        System.out.println("Hello world!");


        // Unary Operator -->!
        // Binary Operator --> +
        //Ternary Operator

        int xyz = 10;
        String result = (xyz == 10) ? "Condition is true" : "Condition is false";

//        String result = xyz == 10 ? "Condition is true" : "Condition is false";

        System.out.println(result);

        //Unlike c ,java works for both int and  as well as float.

        int var1 = 5 % 3;
        double var2 = .5 % .3;

        System.out.println(var1);   //2
        System.out.println(var2);   //0.2


        int v1 = 9;
        int v2 = 20;

        if(v1 == 10)
            System.out.println("v1 is 10");
        else if(v1 > 10)
           System.out.println("v1 is greater than 10");
        else {
            System.out.println("v1 is less than 10");
            if (v2 == 20)
                System.out.println("v2 is 20");
        }


    }

}