package com.company.SpringAopApp.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {

	public String getFortune() {
		
		// simulate a delay

		try {
			
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// return a fortune
		return "Expect heavy traffic this morning";
		
	}

	public String getFortune(boolean tripWire) {

		if (tripWire) {
			throw new RuntimeException("Major accident! Highway is closed!");
		}
		
		return getFortune();
	}
}
