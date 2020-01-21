package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream()
                .findAny();
        if(instructorOptional.isPresent())
            System.out.println(instructorOptional.get());

        instructorOptional = Instructors.getAll().stream().findFirst();
        if (instructorOptional.isPresent())
            System.out.println(instructorOptional.get());


    }
}
