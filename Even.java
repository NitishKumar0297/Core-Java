package com.interthreadcomunicationexample;

public class Even extends Thread{

	int number = 2;
	int limit;
	ShareResource sharedResource;

	Even(int limit, ShareResource sharedResource) {
		this.limit = limit;
		this.sharedResource = sharedResource;
	}

	public void run() {
		while (number <= limit) {
			try {
				sharedResource.evenNumberPrinted(number);
				number=number+2;
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

	}
}
