package com.modernjava.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt= a -> Math.sqrt(a);
        Function<Integer, Double> sqrt1 = Math::sqrt;

        Function<String, String> lowercaseFunction = s -> s.toLowerCase();
        Function<String, String> lowercaseFunction1 = String::toLowerCase;

    }
}
