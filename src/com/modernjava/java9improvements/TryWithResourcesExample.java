package com.modernjava.java9improvements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.Buffer;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        //java 8 
        Reader inputString = new StringReader("Don't cut any corners");
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(BufferedReader bufferedReader1=bufferedReader){
            System.out.println("bufferedReader1.readLine() = "
                    + bufferedReader1.readLine());
        }

        //java 9
        Reader inputString2 = new StringReader("Hang in there");
        BufferedReader bufferedReader2 = new BufferedReader(inputString2);
        try(bufferedReader2){
            System.out.println("bufferedReader2.readLine() = "
                    + bufferedReader2.readLine());
        }
    }
}
