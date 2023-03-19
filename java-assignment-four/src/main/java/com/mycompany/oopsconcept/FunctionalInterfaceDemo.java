package com.mycompany.oopsconcept;

public class FunctionalInterfaceDemo {
    public double areaCircle(double radiusInput){
        Circle c = r -> 3.14 * r * r;
        return c.area(radiusInput);
    }
}
