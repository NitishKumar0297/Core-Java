package com.interthreadcomunicationexample;

public class InterThreadCommunication {

	public static void main(String args[])
	{
		ShareResource sharedResource=new ShareResource();
		Odd o1=new Odd(20,sharedResource);
		Even e1=new Even(20,sharedResource);
		o1.start();
		e1.start();
	}
}
