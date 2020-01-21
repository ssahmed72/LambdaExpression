package com.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.rangeClosed(0,1000).sum();
        System.out.println("sum of 1000 numbers is: " + sum);

        //min
        OptionalInt min = IntStream.rangeClosed(0,1000).min();
        if (min.isPresent())
         System.out.println("Minimum of 1000 numbers is: " + min.getAsInt());

        //max
        OptionalInt max = IntStream.rangeClosed(0,1000).max();
        if (max.isPresent())
            System.out.println("Max of 1000 numbers is: " + max.getAsInt());

        //average
        OptionalDouble average = LongStream.rangeClosed(0,1000).asDoubleStream().average();
        System.out.println("Average is: " + (average.isPresent() ? average.getAsDouble()
                : 0.0));

    }
}
