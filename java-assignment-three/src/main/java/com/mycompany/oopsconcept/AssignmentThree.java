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

    public static int getInstanceCount() {
        return instanceCounter;
    }

    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }

    public void overloadMethod() {
        System.out.println("overloadMethod() :This method is overloaded.");
    }

    public void overloadMethod(String greetings) {
        System.out.println("overloadMethod(String greetings) :This method is overloaded.");
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

