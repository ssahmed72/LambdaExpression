package com.modernjava.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);

        System.out.println("Europe/London: " + ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println("America/New_York: " + ZonedDateTime
                .now(ZoneId.of("America/New_York")));
    }
}
