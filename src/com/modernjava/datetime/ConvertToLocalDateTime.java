package com.modernjava.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertToLocalDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime localDateTime = date.toInstant().
                atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);
        
        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = dateSql.toLocalDate();
        System.out.println("localDate = " + localDate);
        
    }
}
