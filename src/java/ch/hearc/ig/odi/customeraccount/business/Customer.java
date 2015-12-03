package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private HashMap<String,Account> accounts;
	private int number;
	private String firstName;
	private String lastName;

	/**
	 * 
	 * @param number
	 * @param firstName
	 * @param lastName
	 */
	public Customer(Integer number, String firstName, String lastName) {
		this.number = number;
                this.firstName = firstName;
                this.lastName = lastName;
	}

        public Customer() {
            
        }

        
	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
                return accounts.get(number);
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
		this.accounts.put(number,new Account(number,name,rate,this));
	}

    public HashMap<String,Account> getAccounts() {
        return accounts;
    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
        

}