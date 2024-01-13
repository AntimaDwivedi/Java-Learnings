package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        main.doSomething();//FileNotFoundException is a checked(Important) exception that's why it is important to add an exception to method signature either with throws or try catch block.
        main.calculateSomething();//RuntimeException is an unchecked exception ,so it's not necessary to add an exception to method signature.
    }
    public void doSomething() throws FileNotFoundException {
        FileReader in = new FileReader("test.txt");
        System.out.println("do Something");
    }

    public void calculateSomething() throws RuntimeException{
        String x = "one";
        if(x.equals("zero"))
            throw new RuntimeException();
        else
             throw new ArithmeticException();
    }

}