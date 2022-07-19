package com.fasttrack;

import java.awt.event.ItemEvent;
import java.util.*;

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
        Map<String, List<String>> name = new HashMap<>();
        List<String> Personname = new ArrayList<>();
        Personname.add("Alex");
        Personname.add("Mihai");
        Personname.add("George");
        System.out.println(Personname);



        Map<String,List<Integer>> age =new HashMap<>();
        List<Integer> personage =new ArrayList<>();
        personage.add((25));
        personage.add((30));
        personage.add((35));

        age.put("Age",personage);

        System.out.println(age);


        personMap();

    } //2.2 create a map from person's name to their age
    public static void personMap() {
        Map<Person,Integer> persons=new HashMap<>();
        persons.put(new Person("Alex",25,"dark"),11);
        persons.put(new Person("Mihai",30,"blond"),12);
        persons.put(new Person("George",35,"brunet"),13);

        System.out.println(persons);

    }

}
