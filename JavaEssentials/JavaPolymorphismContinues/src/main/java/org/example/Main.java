package org.example;

import org.animal.Animal;
import org.animal.bird.Bird;
import org.animal.bird.Eagle;
import org.animal.fish.Eel;
import org.animal.reptile.Crocodile;
import org.animal.reptile.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals =new ArrayList<>();
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal crocodile = new Crocodile();
        Animal eel = new Eel();
        Bird eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(crocodile);
        animals.add(eel);
        animals.add(eagle);

        listAnimals(animals);


    }

    private static void listAnimals(List<Animal> animals) {
        for (Animal name: animals) {
            System.out.println(name.showInfo());
        }
    }
}