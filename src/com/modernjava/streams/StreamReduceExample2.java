package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has the highest years of experience
        Optional instructor = Instructors.getAll().stream()
                .reduce((s1,s2)-> s2.getYearsOfExperience()
                        >s1.getYearsOfExperience()?s2:s1);
        if(instructor.isPresent())
            System.out.println(instructor.get());

    }
}
