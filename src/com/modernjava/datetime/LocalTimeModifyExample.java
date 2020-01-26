package com.modernjava.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeModifyExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();;
        System.out.println("localTime.plusHours(2) = " + localTime.plusHours(2));
        System.out.println("localTime.plusMinutes(22) = " + localTime.plusMinutes(22));
        System.out.println("localTime.plusSeconds(30) = " + localTime.plusSeconds(30));
        System.out.println("localTime.plusNanos(222222) = " + localTime.plusNanos(222222));
        System.out.println("localTime.minusHours(2) = " + localTime.minusHours(2));
        System.out.println("localTime.minus(ChroUnit.) = "
                + localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("localTime.with(LocalTime.MIDNIGHT) = "
                + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("localTime.with(ChronoField) = "
                + localTime.with(ChronoField.HOUR_OF_DAY,4));




    }
}
