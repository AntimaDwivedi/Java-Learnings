package org.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        // Set is an unordered collection of elements which does not  allow duplicates value.
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Kate");
        set.add("Ria");
        set.add("James");
        set.add("John");
        set.add("john");
        set.add(null);

        System.out.println(set);

        //for each loop
        for (String name :set){
            System.out.println(name);
        }
        System.out.println(set.contains("John"));//true
        System.out.println(set.contains("james"));//false

       // Order of printing the elements in HashSet,LinkedHashSet and TreeSet
        Set<String>set1 = new HashSet();
        System.out.println("Printing order for hash set");

        for(int i =30 ;i>=0 ;i--)
        {
            set1.add("A" + i +" ");

        }
        for (String name :set1){
            System.out.print(name);
        }
        System.out.println();

        Set<String>set2 = new LinkedHashSet<>();
        System.out.println("Printing order for LinkedHash set");

        for(int i =30 ;i>=0 ;i--)
        {
            set2.add("A" + i +" ");
        }
        for (String name :set2){
            System.out.print(name);
        }
        Set<String>set3 = new TreeSet<>();
        System.out.println();
        System.out.println("Printing order for Tree set");//It will store on the basis of natural ordering.
        for(int i =30 ;i>=0 ;i--)
        {
            set3.add("A" + i +" ");
        }
        for (String name :set3){
            System.out.print(name);
        }
        System.out.println();
       // Queue concepts in Java
        // 1.LinkedBlockingQueue -->you don't need to specify the queue size in case of LinkedBlocking Queue.
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(1);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue);

        //2.ArrayBlocking Queue -->You have to specify the size of the queue in case of ArrayBlocking Queue.

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(5);
        try {
            queue2.add(8);
            queue2.add(4);
            queue2.add(7);
            queue2.add(3);
            queue2.add(65);
            queue2.add(80);
            queue2.remove();
            queue2.add(90);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(queue2);

        //Use of offer method --> in this case program will not enter in catch block.
        Queue<Integer> queue3 = new ArrayBlockingQueue<>(5);
       // queue3.remove()--> will give an exception;
        System.out.println(queue3.poll());// will return null as queue is empty right now.
        try {
            queue3.offer(6);
            queue3.offer(4);
            queue3.offer(7);
            queue3.offer(3);
            queue3.offer(65);
            System.out.println(queue3.offer(80));
            queue3.remove();
            queue3.offer(90);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(queue3);
        System.out.println(queue3.peek());//will return the first element of the queue.
        System.out.println(queue3.element());


        // Deque in Java
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.add(8);
        deque.add(6);
        deque.add(9);
        System.out.println(deque);

        deque.addFirst(67);
        deque.addLast(89);
        System.out.println(deque);
        deque.removeLast();

        System.out.println(deque);

        //Map in java  -->Order of the elements is not fixed.Key should be unique in order to print all the values.
        Map<String , String > map = new HashMap<>();
        map.put("a3" ,"kali");
        map.put("a0" ,"kamali");
        map.put("a1" ,"komal");
        map.put("a5" , "Kori ");
        map.put("a2" ,"kashi");
        map.put("a2" ,"kevin"); //If key are same,latest value will be updated.
        map.put("a4" ,"kate");
        System.out.println(map);


        //Iterations over hashmap
        for(String key : map.keySet()){
            System.out.println("Key: "+key + " Value: " +map.get(key));
        }
        System.out.println("***********************");

        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("Key: " +entry.getKey() + " Value: " +entry.getValue());
        }

        System.out.println("***********************");
        Iterator<Map.Entry<String ,String>> entryIterator =  map.entrySet().iterator();
           while(entryIterator.hasNext()){
               Map.Entry<String,String > temp =entryIterator.next();
               System.out.println("Key: " +temp.getKey() + " Value: " +temp.getValue());
        }


    }
}