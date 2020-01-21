package com.modernjava.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        //of
        DoubleStream numbers = DoubleStream.of(1.2,2.2,3.3,4.4,5.5);
        numbers.forEach(System.out::println);
        System.out.println("--------------");

        //iterate
        numbers = DoubleStream.iterate(0,i->i+2.0).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("--------------");

        //generate
        numbers = DoubleStream.generate(new Random()::nextDouble).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("--------------");

        //range
        numbers = LongStream.range(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
        System.out.println("--------------");

        //rangeClosed
        numbers = LongStream.rangeClosed(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
        System.out.println("--------------");
    }
}
