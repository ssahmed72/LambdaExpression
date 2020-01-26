package com.modernjava.factorymethods;

import java.util.*;

public class FactoryMethodsExample {
    public static void main(String[] args) {
        //How we used to create unmodifiable list pre Java 9
        List<String> names = new ArrayList(); 
        names.add("Syed"); 
        names.add("Mike"); 
        names.add("Jenny"); 
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);
        
        //factory methods of Java 9
        List<String> names2 = List.of("Syed", "Mike", "Jenny");
        System.out.println("names2 = " + names2);
        Set<String> set = Set.of("Syed", "Mike", "Jenny");
        System.out.println("set = " + set);
        Map<String, String> map = Map.of("Grade1", "Syed", "Grade2", "Mike");
        System.out.println("map = " + map);
        //modify the list
        //names2.add("Gene");
       // set= Set.of("Syed", "Syed", "Mike");
        names.sort(Comparator.naturalOrder());
        
    }
}
