package org.example;

public class Main {
    public static void main(String[] args) {

        //Polymorphism ,poly == multiple ,morphism == form
        // IS -A relationship

        Phone phone = new Phone();
        phone.feature();

        // This will not work
        //Nokia3310 nokia = new Phone();

        // But this will work
        Phone phone1 = new Nokia3310();
        phone1.feature();


        //Other way to write this
        Phone phone2;
        phone2 = new Iphone();
        phone2.feature();


    }
}