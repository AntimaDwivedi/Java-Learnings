package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

        // Stack Concepts
        Stack<Integer> numbers = new Stack<>();
        numbers.add(23);
        numbers.add(2);
        numbers.add(203);
        numbers.add(25);
        numbers.add(28);

        System.out.println(numbers.isEmpty());

        System.out.println(numbers.pop());//We don't pass any value inside pop bracket as deletion happens only from top.

        System.out.println(numbers);

        System.out.println(numbers.search(2));//It will return index of the element.index starting from 1 and from the last.
        int x = numbers.indexOf(2);
        System.out.println(x);//Index starting from 0 and from top as Stacklist is inheriting the indexOf() method of parent class that is vector.
        // Check doc for better understandings.


        // LinkedList
        LinkedList<String> names = new LinkedList<>();
        names.add("Geeta");
        names.add("Reeta");
        names.add("Seeta");
        names.add("Meeta");
        names.add("Jetha");
        System.out.println(names);
        names.add(2,"Daya");//Index starting from 0 and from top.
        System.out.println(names);
        names.set(3,"Tappu");//Updating the value of index 3.
        System.out.println(names);
        names.remove();//Will remove the first indexed element.
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
















    }


}