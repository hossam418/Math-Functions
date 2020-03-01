package com.company;
import java.lang.Math;

public class SphereVolume implements ISubscriber{
    @Override
    public void notifySubscriber(String input)
    {
        try
        {
            double radius = Double.parseDouble(input);

            double SphereVolume = (4.0/3* Math.PI *Math.pow(radius,3));

            System.out.println("Sphere volume : " + SphereVolume);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
