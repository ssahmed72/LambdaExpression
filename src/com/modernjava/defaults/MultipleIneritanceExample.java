package com.modernjava.defaults;

public class MultipleIneritanceExample implements InterfaceA, InterfaceB, InterfaceC {
    public static void main(String[] args) {
        MultipleIneritanceExample multipleIneritanceExample = new MultipleIneritanceExample();
        multipleIneritanceExample.sumA(4,8);  // resolve to child
        multipleIneritanceExample.sumB(2,4);
        multipleIneritanceExample.sumC(1,2);
    }

    // implemented class first
    // the sub interface that extends the interface

    public void sumA (int num1, int num2){
        System.out.println("MultipleIneritanceExample.sumA" + (num1 + num2));
    }
}
