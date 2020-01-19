package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScope {
    static int k=0;
    public static void main(String[] args) {
        int b =10; //local variable
        IntConsumer intConsumer = (a) -> System.out.println(a*10);

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            System.out.println(instructor + " " +  k);
        });
        k++;

    }
}
