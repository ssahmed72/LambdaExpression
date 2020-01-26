package com.modernjava.java9improvements;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String month="JANUARY";
        switch (month){
            case "JANUARY", "FEBURARY", "MARCH" -> System.out.println("FIRST QUARTER");
            case "APRIL", "MAY", "JUNE" -> System.out.println("SECOND QUARTER");
            case "JULY", "AUGUST", "SEPTEMBER"-> System.out.println("THIRD QUARTER");
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> System.out.println("FOURTH QUARTER");
            default -> System.out.println("UNKNOWN QUARTER");
        }

    }
}
