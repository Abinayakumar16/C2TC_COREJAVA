package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Samsung implements Phone {
	//Program to define concrete class that implements the Phone interface

		@Override
		public void call() {
			System.out.println("Calling using Samsung");
		}

		@Override
		public void sms() {
			System.out.println("Messaging using Samsung");

		}

	}



