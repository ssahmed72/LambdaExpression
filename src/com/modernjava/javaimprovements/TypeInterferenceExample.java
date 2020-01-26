package com.modernjava.javaimprovements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {

    public static void main(String[] args) {
        //String
        //String name = "Mike";
        var name = "Mike";
        System.out.println("name = " + name);

        var dateTime = LocalDateTime.now(); // LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        HashMap<Integer, String> map = new HashMap<>();
        var map1 = new HashMap<Integer, String>();

        //integer array
        int[] numbers = {1,2,3,4,5};
        var numbers1 = new int[] {1,2,3,4,5};

        //list
        List<String> names = new ArrayList<>(); 
        names.add("Syed"); 
        names.add("Mike");
        System.out.println("names = " + names);
        
        var names1 = new ArrayList<>(); 
        names1.add("Gene"); 
        names1.add(1.0001);
        names1.add(1);
        System.out.println("names1 = " + names1);
        
        //
        var integers = List.of(1,2,3,4,5);
        integers.forEach(System.out::println);
        
        //int num = 999999999999999L; 
        var num = 99999999999999999.99999; 
        
        var result = 9/2; //4
        System.out.println("result = " + result);
        
        var result1 = 9.0/2;
        System.out.println("result1 = " + result1);
        
        result1 = 11d/2d;
        System.out.println("result1 = " + result1);

        var idiomOfTheDay = "A blessing in disguise";
        printString(idiomOfTheDay);


    }

    public static void printString (String toPrint){
        System.out.println("toPrint = " + toPrint);
    }
}
