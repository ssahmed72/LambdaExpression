package com.modernjava.lambda;

public class ConcetanateTraditional implements  ConcatenateInterface{
    @Override
    public String sconcat(String a, String b) {
        return a + " "  + b;
    }

    public static void main(String[] args) {
        ConcetanateTraditional concetanateTraditional = new ConcetanateTraditional();
        System.out.println(concetanateTraditional.sconcat("Hello", "World"));

    }
}
