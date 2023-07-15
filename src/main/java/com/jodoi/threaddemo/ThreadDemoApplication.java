package com.jodoi.threaddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadDemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ThreadDemoApplication.class, args);
		SharedResource sharedResource = new SharedResource();

		Thread thread1 = new Thread(() -> {
				for (int i = 0; i < 100000; i++) {
						sharedResource.incrementCounter();
				}
		});

		Thread thread2 = new Thread(() -> {
				for (int i = 0; i < 100000; i++) {
						sharedResource.incrementCounter();
				}
		});

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

		System.out.println("Counter value: " + sharedResource.getCounter());
	}
}
