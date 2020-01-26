package com.modernjava.java9improvements;

public class SwitchStatementExample {
    public static void main(String[] args) {
        String month="JANUARY";
        String quarter;
        switch (month){
            case "JANUARY":
                quarter = "FIRST QUARTER";
                break;
            case "FEBURARY":
                quarter = "FIRST QUARTER";
                break;
            case "MARCH":
                quarter = "FIRST QUARTER";
                break;
            case "APRIL":
                quarter = "SECOND QUARTER";
                break;
            case "MAY":
                quarter = "SECOND QUARTER";
                break;
            case "JUNE":
                quarter = "SECOND QUARTER";
            case "JULY":
                quarter = "THIRD QUARTER";
                break;
            case "AUGUST":
                quarter = "THIRD QUARTER";
                break;
            case "SEPTEMBER":
                quarter = "THIRD QUARTER";
                break;
            case "OCTOBER":
                quarter = "FORTH QUARTER";
                break;
            case "NOVEMBER":
                quarter = "FOURTH QUARTER";
                break;
            case "DECEMBER":
                quarter = "FOURTH QUARTER";
                break;
            default:
                quarter= "UNKNOWN QUARTER";
                break;
        }
        System.out.println("quarter = " + quarter);
    }
}
