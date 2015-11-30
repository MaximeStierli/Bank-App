package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private Collection<Account> accounts;
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
                boolean Exist = false;
		for (Account account : accounts){
                    if(account.getNumber() == number){
                        Exist = true;
                        return account;
                    }
                }
                throw new IllegalArgumentException("Le compte n'existe pas !");
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
		this.accounts.add(new Account(number,name,rate,this));
	}

    public Collection<Account> getAccounts() {
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