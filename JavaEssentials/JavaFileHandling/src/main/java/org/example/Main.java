package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       File file1 = new File("file1.txt");
        System.out.println(file1.createNewFile());



        File file2 = new File("src/file2.txt");
      //File file2 new File ("src\\file2.txt");
        if(file2.mkdir()){
            System.out.println("File created");
        }
        else{
            System.out.println("File already created");
        }

        //In case of folders you have to use mkdirs() instead of mkdir().
        File file3 = new File("Folder/subfolder/yetAnotherFolder");
        if(file3.mkdirs()){
            System.out.println("Folder created");
        }
        else{
            System.out.println("Folder already created");
        }

       //os
       String OS = System.getProperty("os.name");
        System.out.println(OS);

        //program to identify the os of the machine

        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win")){
            System.out.println("Windows");
        }
        else if(os.contains("mac")){
            System.out.println("Apple System");
        }
        else{
            System.out.println("Unknown OS");
        }
    }
}