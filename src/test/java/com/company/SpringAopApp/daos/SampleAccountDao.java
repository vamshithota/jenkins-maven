package com.company.SpringAopApp.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.company.SpringAopApp.Account;

@Component
public class SampleAccountDao {
	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		Account temp3 = new Account("Luca", "Gold");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		
		return myAccounts;		
	}
	
public List<Account> findAll(boolean flag) {
	if (flag) {
		throw new RuntimeException("Exception throwed from find all in sampledaoaccount class!!!");
	}	
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		Account temp3 = new Account("Luca", "Gold");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		return myAccounts;		
	}
	


	public void addAcount(Account account, boolean flag) {
		System.out.println(getClass() + " in sample account dao class");
		
	}
	
	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	

}
