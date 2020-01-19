package com.modernjava.funcprogramming;

import java.util.List;

public class Instructor {
    String name;
    int yearsOfExperience;
    String title;
    String gender;
    boolean onlineCourses;
    List<String> courses;

    public Instructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
        this.gender = gender;
        this.onlineCourses = onlineCourses;
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", onlineCourses=" + onlineCourses +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOnlineCourses() {
        return onlineCourses;
    }

    public void setOnlineCourses(boolean onlineCourses) {
        this.onlineCourses = onlineCourses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
