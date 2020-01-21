package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        //grouping the instructors in two sets of online course vs not online
        //and get the max years of experience of the instructors
        Map<Boolean, Optional<Instructor>> maxInstructors = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing
                                (Instructor::getYearsOfExperience))));

        maxInstructors.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));
        System.out.println("---------");

        //collectingAndThen
        Map<Boolean, Instructor> maxInstructors1 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing
                                (Instructor::getYearsOfExperience)),
                                Optional::get)));

        maxInstructors1.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));

        //average years of experience of instructors who teaches online or not

        Map<Boolean, Double> maxInstructors2 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                                Collectors.averagingInt(
                                        Instructor::getYearsOfExperience)
                                ));
        System.out.println("---------");
        maxInstructors2.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));

        //drive a statistical summary from properties of grouped items

        Map<Boolean, IntSummaryStatistics> maxInstructors3 = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt(
                                Instructor::getYearsOfExperience)
                ));
        System.out.println("---------");
        maxInstructors3.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));




    }
}
