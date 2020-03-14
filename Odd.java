package com.interthreadcomunicationexample;

public class Odd extends Thread {

	int number=1;
	int limit;
	ShareResource sharedResource;
	
	public Odd(int limit,ShareResource sharedResource)
	{
		this.limit=limit;
		this.sharedResource=sharedResource;
	}
	public void run()
	{
		while(number<=limit)
		{
			try {
				sharedResource.oddNumberPrinted(number);
				number=number+2;
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
			
	}
}
