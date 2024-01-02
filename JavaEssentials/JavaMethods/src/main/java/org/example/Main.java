package org.example;

public class Main {
    public static void main(String[] args) {
        //Java Methods
        loop(1, 10);
        System.out.println("Hello world!");
        loop(21, 30);

        areaOfRectangle(5, 9);
        //It's on  you whether you are assigning return statement value yo a variable.Program will not show any error,just value would be ignored.
        // Returning a value is required ,Receiving a value is not.
        int result = areaOfSquare(8);
        System.out.println("Area of square is " + result);
        System.out.println("Area of square is " + areaOfSquare(9));


        sum(7, 8);
        sum(9, 8.9f);
        sum(8.0f, 6.0f);
        sum(7.0f, 8);

        //Literals in Java
        System.out.println("Hello \n There");
        System.out.println("Hello \t There");
        System.out.println("Hello\bThere");
        System.out.println("Hello \\ There");
        System.out.println("Hello \"There\"");



    }

    public static void loop(int start, int stop) {
        for (; start <= stop; start++) {
            System.out.println(start);
        }
    }

    public static void areaOfRectangle(int height, int width) {

        System.out.println("Area of rectangle is " + height * width);
    }

    //Methods with return type

    public static int areaOfSquare(int side) {
        return side * side;
    }

    //Method overloading
    //When there are multiple methods with same name ,but with different method  signature then it is called method overloading.

    public static double area(int height, int width) {
        return height * width;
    }

    //Below method  will show an error as you are changing the return type-only ,method name and signature are exact same with the above one and hence method overloading is not getting applied here.
//    public static int area(int height,int width)
//    {
//        return height*width;
//    }
    public static double area(double height, double width) {
        return height * width;
    }


    public static double area(double side) {
        return side;
    }

    public static int area(int side) {
        return side;
    }

    //
    public static void sum(int x, int y) {
        System.out.println("Addition of two int variables");
    }

    public static void sum(float x, float y) {
        System.out.println("Addition of two float variables");
    }

    public static void sum(int x, float y) {
        System.out.println("Addition of one int and one float  variable.");
    }

    public static void sum(float x, int y) {
        System.out.println("Addition of one float and one  int variable");
    }



}