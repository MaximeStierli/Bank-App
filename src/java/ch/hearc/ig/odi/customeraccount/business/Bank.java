/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashMap;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
public class Bank {
    private int number;
    private String name;
    private HashMap<Integer,Customer> customers;
    private HashMap<String,Account> accounts;
    
    public Bank(int number, String name){
        this.number = number;
        this.name = name;
        this.customers = new HashMap();
        this.accounts = new HashMap();
    }
    
    public Account getAccountByNumber(String number){
        for(Account acc : this.accounts.values()){
            if(acc.getNumber().equals(number)){
                return acc;
            }
        }
        return null;
    }
    
    public Customer getCustomerByNumber(int number){
        for(Customer cus : this.customers.values()){
            if(cus.getNumber() == number){
                return cus;
            }
        }
        return null;
    }
    
    public Customer addCustomer(int number, String fn, String ln){
        Customer cust = new Customer(number,fn,ln);
        this.customers.put(number,cust);
        return cust;
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        Account acc = new Account(number,name,rate,customer);
        this.accounts.put(number, acc);
        //return acc;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer,Customer> getCustomers() {
        return customers;
    }

    public HashMap<String,Account> getAccounts() {
        return accounts;
    }
    
    
}
