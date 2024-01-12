package org.example;

public class SamsungPhone implements Phone , Android {

    @Override
    public String processor(){
        return "S1000";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }

    @Override
    public String whatsapp() {
        return "send messages";
    }
}
