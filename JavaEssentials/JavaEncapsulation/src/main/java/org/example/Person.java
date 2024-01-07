package org.example;

public class Person {

    //It's not a good idea to initialize variables like this

    public String name = "Gauri";
    public int age = 2;

    public String gender = "female";


    // A better approach is to initialize the values in the default constructor, because it will actually restrict the initialization, and it will ensure the initialization.
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


}
