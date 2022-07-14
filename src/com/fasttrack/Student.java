package com.fasttrack;

import java.util.*;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {



        Map<String, Integer> student = new HashMap<>();
        student.put("Alex", 8);
        student.put("Mihai", 9);
        student.put("George", 10);
        student.put("Alina", 7);
        student.put("Iulia", 6);

        //Print all students and their grades
        System.out.println(student);

        //Student with the highest grade
        int maxValueInMap = (Collections.max(student.values()));
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }

        }
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", 30, "dark"));
        person.add(new Person("Miha", 25, "blond"));
        person.add(new Person("Iulia", 26, "bruneta"));
        person.add(new Person("Alina", 22, "bruneta"));

        System.out.println(person);


    }


}
