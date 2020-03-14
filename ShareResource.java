package com.interthreadcomunicationexample;

public class ShareResource {

	boolean isOddPrinted = false;

	public synchronized void oddNumberPrinted(int number) throws InterruptedException {
		while (isOddPrinted) {
			wait();
		}

		isOddPrinted = true;
		Thread.currentThread().setName("Odd Thread");
		System.out.println(Thread.currentThread().getName() + "   " + number);
		notify();
	}

	public synchronized void evenNumberPrinted(int number) throws InterruptedException {
		while (!isOddPrinted) {
			wait();
		}

		isOddPrinted = false;
		Thread.currentThread().setName("Even  Thread");
		System.out.println(Thread.currentThread().getName() + "   " + number);
		notify();
	}
}
