package org.example;

import org.animal.Animal;
import org.animal.bird.Eagle;
import org.animal.fish.Eel;
import org.animal.reptile.Crocodile;
import org.animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        System.out.println("Animal attributes");
        System.out.println(animal.showInfo());

        Reptile reptile = new Reptile();
        System.out.println("Reptile attributes");
        System.out.println(reptile.showInfo());

        Crocodile crocodile = new Crocodile();
        System.out.println("Reptile attributes");
        System.out.println(crocodile.showInfo());

        Eel eel = new Eel();
        System.out.println("Eel attributes");
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println("Eagle attributes");
        System.out.println(eagle.showInfo());
    }
}