package com.mycompany.oopsconcept;

public class Main {
    public static void main(String[] args){

        //Constructor chaining
        System.out.println("Constructor chaining sets the name and age parameter");
        AssignmentThree assignmentThree = new AssignmentThree("John", 25);
        assignmentThree.printInfo();

        //Generic method for Integer as parameter
        System.out.println("Generic method");
        System.out.println(assignmentThree.genericMethod(10));
        //Generic method for String as parameter
        System.out.println(assignmentThree.genericMethod("Hello"));

        //Method chaining
        System.out.println("Method Chaining");
        assignmentThree.setAge(40).printInfo();

        //Static method call
        System.out.println("Static method call counter" + AssignmentThree.getInstanceCount());

        //Final method call
        System.out.println("Final method call");
        assignmentThree.finalMethod();

        //Overloaded method calls
        System.out.println("Overloaded method calls");
        assignmentThree.nonFinalMethod();
        assignmentThree.nonFinalMethod("Hello there!!");

        //Overridden method call
        System.out.println("Overridden method call");
        System.out.println(assignmentThree.toString());
    }
}
