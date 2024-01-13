package org.example;

public class Main {


    public static void main(String[] args) {
        Learning learning = Learning.COLLECTIONS;
        switch(learning){
            case COREJAVA -> System.out.println("core java");
            case COLLECTIONS -> System.out.println("collections");
            case GENERICS -> System.out.println("generics");
            case JSP -> System.out.println("JSP");
            case MULTITHREADING -> System.out.println("multithreading");
        }

        System.out.println(Learning.JSP);
        System.out.println(Learning.GENERICS.getI());




    }
}