package com.mycompany.oopsconcept;

public class ConstructorChaining {
    private String name;
    private int age;

    public ConstructorChaining(String name) {
        this.name = name;
    }

    //Constructor chaining
    public ConstructorChaining(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
