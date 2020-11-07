package com.company.SpringAopApp.daos;

import org.springframework.stereotype.Component;

@Component
public class SampleMemberDao {
	
	public void addMember() {
		System.out.println(getClass() + " in addmemeber dao class");
	}

	public void doWork() {
		System.out.println("do work called");
	}
	
}
