package com.modernjava.optional;

import java.util.Optional;

public class OptionalIfIsExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        if(stringOptional.isPresent())
            System.out.println("stringOptional = " + stringOptional);

        stringOptional.ifPresent(s -> System.out.println("s = " + s));
    }
}
