package com.company;

public class SimpleSubscriber implements ISubscriber{
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Hello, I am a simple subscriber and I am notified with " + input);
    }
}
