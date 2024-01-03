package org.example;

import java.util.ArrayList;

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



    }


}