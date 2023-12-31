package org.example;

public class Main {
    public static void main(String[] args) {

// In switch cases there is no condition checking, so we must add a break.
// Sequence of switch statements can be changed, and you can skip the break for the last one(whether it's a default statement or case stmt)
//To avoid confusion, it is always better to use a break with every stmt of switch.
// Incompatible types. Found: 'float', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'


        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("X is any value other than 1,2,3");
                break;
        }
        int y = 8;
        switch (y) {
            default:
                System.out.println("Y is any value other than 1,2,3");
                break;
            case 1:
                System.out.println("y is 1");
                break;
            case 2:
                System.out.println("y is 2");
                break;
            case 3:
                System.out.println("y is 3");

        }
        // is switch case-sensitive

        char var = 'B';
        switch(var){
            case 'a':
                System.out.println("var is a ");
                break;
            case 'b':
                System.out.println("var is b");
                break;
            default:
                System.out.println("var is other than a and b");

        }
// to make upper and lower  both cases work ,we have to convert each and every variable in lower case.
        char var2 = 'B';
        switch(Character.toLowerCase(var2)){
            case 'a':
                System.out.println("var2 is a ");
                break;
            case 'b':
                System.out.println("var2 is b");
                break;
            default:
                System.out.println("var2 is other than a and b");

        }
// Switch with String variable
        String var3 = "A";
          switch(var3.toLowerCase()){
              case "a":
                  System.out.println("var3 is a");
                  break;
              case "b":
                  System.out.println("var3 is b");
                  break;
              default:
                  System.out.println("var3 is other than a and b");
                  break;
          }
// Enhanced  switch statement
        String var4 = "A";
        switch (var4.toLowerCase()) {
            case "a" -> System.out.println("var4 is a");
            case "b" -> System.out.println("var4 is b");
            default -> System.out.println("var4 is other than a and b");
        }
        System.out.println("Hello world!");
//Loops in Java
//        for(;;)
//        {
//            System.out.println("This is an infinite loop");
//        }
// for loop
        for(int i = 0; i<=10 ;i++)
        {
            System.out.println(i);
        }

// while loop
        int j = 0;
        while(j<=10) {
            System.out.println(j);
            j++;
        }

// do while loop
       int k =0;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);
// break can't be used outside of switch and loops.

//so the bottom line is whenever we are executing continue statement, all the statement after continue will not get executed, but the statements before continue will execute.
         for(int i =0; i<10 ;i++) {
             System.out.println("Before continue");
             if (i == 5) {
                 continue;
             }
             System.out.println(i);
         }
// for each loop
    int []arr = {1,2,3,4};
         for( int temp :arr){
             System.out.println(temp);
         }
    }
}