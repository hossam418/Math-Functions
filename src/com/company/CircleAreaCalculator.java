package com.company;

public class CircleAreaCalculator implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		double area = r * r * Math.PI ;
		System.out.println("The circle area = " + area);
	}
	
}
