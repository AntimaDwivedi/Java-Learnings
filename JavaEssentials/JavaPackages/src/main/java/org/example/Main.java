package org.example;

//import org.example.blog.Home;

import org.example.blog.*;

public class Main {
    public static void main(String[] args) {

        Home home1 = new Home();
        home1.message();

        org.example.store.Home home2 = new org.example.store.Home();
        home2.message();

    }
}