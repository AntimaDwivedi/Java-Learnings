package org.example;

public class Main {
    public static void main(String[] args) {

        String a = "study";
        String b = "easy";

        String d =a.concat(b);

        String c = a+b;
        System.out.println(c);

        if(a == "study"){
            System.out.println("study");
        }else{
            System.out.println("easy");
        }
        if(c == "studyeasy"){
            System.out.println("study is easy");
        }
        else{
            System.out.println("study is hard");
        }
        if(c.equals("studyeasy")){
            System.out.println("study is easy  easy");
        }else{
            System.out.println("study is hard hard  ");
        }
        System.out.println(c);
        System.out.println((c.replace("study" ,"play")));

    }
}