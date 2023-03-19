package com.mycompany.oopsconcept;

public class MethodChaining {
    private String name;
    private int age;
    public MethodChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MethodChaining setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
