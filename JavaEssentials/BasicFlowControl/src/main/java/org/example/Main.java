package org.example;

public class Main {
    public static void main(String[] args) {

// In switch cases there is no condition checking ,that's why we have to add break.
// Sequence of switch statements can be changed ,and you can skip the break for the last one(whether it's a default statement or case stmt)
// In order to avoid confusions ,it is always better to use break with each and every stmt of switch.
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
        System.out.println("Hello world!");
    }
}