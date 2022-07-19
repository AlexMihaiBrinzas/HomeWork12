package com.fasttrack;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String haircolour;

    public Person(String name, int age, String haircolour) {
        this.name = name;
        this.age = age;
        this.haircolour = haircolour;
    }

    public String getName(){

        return name;
    }


    public int getAge() {
        return age;
    }

    public String getHaircolour() {
        return haircolour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haircolour='" + haircolour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}

