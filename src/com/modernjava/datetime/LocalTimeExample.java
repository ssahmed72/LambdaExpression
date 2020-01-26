package com.modernjava.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        
        localTime = LocalTime.of (15, 18);
        System.out.println("localTime = " + localTime);
        
        localTime = LocalTime.of(15, 18, 22);
        System.out.println("localTime = " + localTime);

        localTime = LocalTime.of(15,18,23,22222222);
        System.out.println("localTime = " + localTime);

        //get
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());

        System.out.println("localTime.get(ChronoField) = "
                + localTime.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.get(ChronoField) = " +
                localTime.get(ChronoField.MINUTE_OF_DAY));

        
        
    }
}
