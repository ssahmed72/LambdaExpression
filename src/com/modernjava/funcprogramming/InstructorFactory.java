package com.modernjava.funcprogramming;

import java.util.List;

public interface InstructorFactory {
    Instructor getInstructor(String name, int yearsOfExperience, String title,
                                             String gender, boolean onlineCourse, List<String> courses);
}
