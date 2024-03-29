package com.mycompany.oopsconcept;

public class Main {
    public static void main(String[] args){

        //Constructor chaining
        System.out.println("Constructor chaining sets the name and age parameter");
        ConstructorChaining constructorChaining = new ConstructorChaining("John", 25);
        System.out.println("Name is : " + constructorChaining.getName());
        System.out.println("Age is : " + constructorChaining.getAge());

        GenericExample genericExample = new GenericExample();
        //Generic method for Integer as parameter
        System.out.println("Generic method");
        System.out.println(genericExample.genericMethod(10));
        //Generic method for String as parameter
        System.out.println(genericExample.genericMethod("Hello"));


        MethodChaining methodChaining = new MethodChaining("John", 25);
        //Method chaining
        System.out.println("Method Chaining");
        methodChaining.setAge(40).printInfo();

        AssignmentThree assignmentThree = new AssignmentThree("John", 25);

        //Static method call
        System.out.println("Static method call counter" + AssignmentThree.getInstanceCount());

        //Final method call
        System.out.println("Final method call");
        assignmentThree.finalMethod();

        //Overloaded method calls
        System.out.println("Overloaded method calls");
        assignmentThree.overloadMethod();
        assignmentThree.overloadMethod("Hello there!!");

        //Overridden method call
        System.out.println("Overridden method call");
        System.out.println(assignmentThree.toString());
    }
}
