package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        //Stream min function
        Optional result = numbers.stream().min(Integer::compareTo);
        if(result.isPresent())
        System.out.println(result.get());

        //reduce function
        //(0,1) - 0  //(0,3) - 0
        //(0,2) - 0
        int result1 = numbers.stream().reduce(0,(a,b) -> a<b?a:b);
        System.out.println(result1);

        Optional result2 = numbers.stream().reduce((a,b) -> a<b?a:b);
        if(result2.isPresent())
            System.out.println(result2.get());

        Optional result3 = numbers.stream().reduce(Integer::min);
        if(result3.isPresent())
            System.out.println(result3.get());


    }
}
