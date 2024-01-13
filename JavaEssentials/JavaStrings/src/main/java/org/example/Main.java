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

        // str1 and str2 both objects are pointing to same memory location.(==) methods compares  memory location while
        // .equals() compares the objects.
        //String Literals
        String str1 = "Hello World !";
        String str2 = "Hello World !";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        // str3 and str4 both are pointing to different objects stored in different memory locations.
        // String objects
        String str3 =  new String("Hello World");
        String str4 =  new String("Hello World");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        //It's a good practice to use  methods  defined  under String class.
    }
}