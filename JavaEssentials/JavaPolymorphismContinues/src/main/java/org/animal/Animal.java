package org.animal;

public class Animal {

    protected float heightInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public Animal() {
        this.heightInFeet = 0;
        this.weightInKilos = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }


    //Here toString method ,has been renamed as showInfo().
    public String showInfo() {
        return "Animal{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
