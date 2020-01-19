package com.modernjava.funcprogramming;

import java.util.function.*;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(100));

        Function<Integer, Integer> function = i -> i*10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i *10;
        System.out.println(intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator = i -> i*10;
        System.out.println(longUnaryOperator.applyAsLong(10000000000000000l));

        DoubleUnaryOperator doubleUnaryOperator = i -> i*10;
        System.out.println(doubleUnaryOperator.applyAsDouble(2000000.20000000));
    }

}
