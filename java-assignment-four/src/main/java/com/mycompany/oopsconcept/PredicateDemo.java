package com.mycompany.oopsconcept;

import java.util.function.Predicate;

public class PredicateDemo {

    public boolean drivingCheck(Integer inputAge){

        boolean isDrivingAllowed = false;

        Predicate<Integer> drivingAllowedOrNot = age -> age >= 18;

        isDrivingAllowed = drivingAllowedOrNot.test(inputAge);
        if(isDrivingAllowed){
            System.out.println("You are allowed to Drive");
        }else {
            System.out.println("You are not allowed to Drive");
        }

        return isDrivingAllowed;
    }
}
