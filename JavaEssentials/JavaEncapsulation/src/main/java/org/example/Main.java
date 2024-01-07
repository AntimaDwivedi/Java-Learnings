package org.example;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("John" ,31 ,"male");
        //person.age = -5;  -->but age can't be -5
        //In order to restrict this type of modification in code we should have use private access specifier and  getter-setter.
        person.setAge(898);
        person.setName("john");
        System.out.println(person);

    }
}