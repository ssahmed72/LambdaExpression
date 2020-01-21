package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience b/w instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);

        System.out.println(result);


    }
}
