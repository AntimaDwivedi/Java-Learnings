package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Intwrapper{

    public  int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Intwrapper(int num) {
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();

        listNames.add("Archana");
        listNames.add("Preeti");
        listNames.add("Nidhi");
        listNames.add("Anu");
        listNames.add("Anuj");
        System.out.println(listNames);

        // How to fetch the elements
        for (String temp: listNames
             ) {
            System.out.println(temp);
        }
        System.out.println(listNames.get(3));
        // Removal of elements
        listNames.remove(listNames.remove(0));
        System.out.println(listNames.remove("Anu"));//sout will help us to know whether the operation is successful or not.
        System.out.println(listNames);
        System.out.println(listNames.set(0,"John"));
        System.out.println(listNames);
        System.out.println(listNames.indexOf("Jolly"));// will return "-1" as the value is not present in the array.

        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(23);
        listNumbers.add(90);
        listNumbers.add(78);
        System.out.println(listNumbers);


        // Autoboxing and unboxing
        ArrayList<Integer> listNumbers1 = new ArrayList<>();
        listNumbers1.add(25);// Autoboxing
        System.out.println(listNumbers1.get(0));// Auto-unboxing

        // User-defined Wrapper class
        ArrayList<Intwrapper>listNumbers2 = new ArrayList<>();
        listNumbers2.add(new Intwrapper(89));  // boxing

        System.out.println(listNumbers2.get(0).getNum()); // unboxing


        // Autoboxing and unboxing behind the scenes
        ArrayList<Double> listNumbers3 = new ArrayList<>();
        listNumbers3.add(Double.valueOf(25)); // Java actually uses this method for autoboxing.
        System.out.println(listNumbers3);
        System.out.println(listNumbers3.get(0).doubleValue()); // // Java actually uses this method for unboxing






    }


}