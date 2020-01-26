package com.modernjava.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello World");
        System.out.println("optionalString = " + optionalString);

        System.out.println("getWords: " + getWords());
    }

    public static Optional<String> getWords(){
        String[] words = new String[10];
        words[1]= "test";
        Optional<String> optionalS = Optional.ofNullable(words[1]);
        if(optionalS.isPresent())
            return optionalS;
        else
            return Optional.empty();
    }
}
