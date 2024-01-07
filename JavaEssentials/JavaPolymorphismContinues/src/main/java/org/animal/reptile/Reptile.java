package org.animal.reptile;

import org.animal.Animal;

public class Reptile extends Animal {

    protected String skin,egg;
    protected  boolean backbone;


    public Reptile() {
        heightInFeet =5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry skin";
        this.egg = "soft shelled";
        this.backbone = true;
    }
    public String showInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                "} " ;
    }
}
