package org.example;

public class IPhone implements Phone ,Ios {
    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public int spaceInGB() {
        return 512;
    }

    @Override
    public String airdrops() {
        return "copy paste from anywhere";
    }
}
