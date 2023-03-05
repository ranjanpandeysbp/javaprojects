package com.mycompany.oopsconcept;

public class AssignmentThree {
    private static int instanceCounter = 0;
    private final String name;
    private int age;

    public AssignmentThree(String name) {
        this.name = name;
        instanceCounter++;
    }

    //Constructor chaining
    public AssignmentThree(String name, int age) {
        this(name);
        this.age = age;
    }

    public AssignmentThree setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static int getInstanceCount() {
        return instanceCounter;
    }

    //generic method
    public <T> T genericMethod(T parameter) {
        return parameter;
    }

    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }

    public void nonFinalMethod() {
        System.out.println("nonFinalMethod() :This method is overridden.");
    }

    public void nonFinalMethod(String greetings) {
        System.out.println("nonFinalMethod(String greetings) :This method is overloaded.");
        System.out.println(greetings);
    }

    // Method overriding
    @Override
    public String toString() {
        return "AssignmentThree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

