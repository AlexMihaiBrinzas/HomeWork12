package com.fasttrack;

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
}
