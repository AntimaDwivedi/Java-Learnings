package org.example;

public class Main {
    public static void main(String[] args) {
        SamsungPhone phone1 = new SamsungPhone();

        String p = phone1.processor();

        System.out.println(p);
        System.out.println(phone1.spaceInGB());

        IPhone phone2 =  new IPhone();
        String s = phone2.processor();

        System.out.println(s);
        System.out.println(phone2.spaceInGB());

        //More optimal way by using interfaces.
        Phone phone3 = new SamsungPhone();
        System.out.println(phone3.processor());
        System.out.println(phone3.spaceInGB());

        //You can not call whatsapp method() if your object type is Phone.In order to do so make object of SamsungPhone class.

        SamsungPhone phone4 = new SamsungPhone();
        System.out.println(phone4.spaceInGB());
        System.out.println(phone4.processor());
        System.out.println(phone4.whatsapp());



    }
}