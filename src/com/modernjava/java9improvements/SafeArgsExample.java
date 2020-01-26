package com.modernjava.java9improvements;


import java.util.ArrayList;
import java.util.List;

public class SafeArgsExample {

    private void print(List... names) {
        for (List<String> name : names) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        SafeArgsExample safeArgsExample = new SafeArgsExample();
        List<String> list = new ArrayList<String>();
        list.add("Syed");
        list.add("Mike");
        list.add("Jenny");
        safeArgsExample.print(list);
    }
}
