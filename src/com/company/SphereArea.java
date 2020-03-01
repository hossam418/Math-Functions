package com.company;

public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

          double Radius = Double.parseDouble(input);
            System.out.println( "Sphere Area = "+Calculate_Area(Radius));
}
double Calculate_Area(double radius){
        return (4 * Math.PI * radius * radius);
}

}
