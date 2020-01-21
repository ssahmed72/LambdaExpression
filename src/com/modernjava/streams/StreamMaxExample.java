package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        //max using stream max function
        Optional result = numbers.stream().max(Integer::compareTo);
        if(result.isPresent())
            System.out.println(result.get());
        //(0,1) - 1   // return 0
        //(1,2) - 2
        //(2,3) - 3
        int result2 = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
        Optional result3 = numbers.stream().reduce((a,b)->a>b?a:b);
        if(result3.isPresent())
            System.out.println(result3.get());

        Optional result4 = numbers.stream().reduce(Integer::max);
        if(result4.isPresent())
            System.out.println(result4.get());


    }
}
