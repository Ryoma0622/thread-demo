package com.jodoi.threaddemo;

import org.springframework.stereotype.Service;

@Service
public class ThreadDemo {

    public void countNumber() {
        for (int i = 1; i <= 100; i++) {
            final int count = i;
            new Thread(() -> {
                System.out.println("Thread " + count + " counting: " + count + " " + Thread.currentThread().getName());
            }).start();
        }
    }
}
