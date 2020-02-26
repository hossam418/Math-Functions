package com.company;

public class SphereCircumference implements ISubscriber{
    @Override
    public void notifySubscriber(String input)
    {
        double radios = Double.valueOf(input);

        double circumference = (2 * Math.PI * radios);

        System.out.println("Sphere Circumference : " + circumference);

    }
}