package com.company;

public class Fibonacci implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        long n = Integer.parseInt(input);
        long t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {

            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("Fibonacci is: " + t1);
    }

}
