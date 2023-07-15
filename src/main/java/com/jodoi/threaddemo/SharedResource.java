package com.jodoi.threaddemo;

public class SharedResource {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public synchronized void incrementCounter() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is incrementing the counter");
        counter++;
    }
}
