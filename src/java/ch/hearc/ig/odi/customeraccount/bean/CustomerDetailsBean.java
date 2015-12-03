/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@SessionScoped
@Named (value="CustomerDetailsBean")
public class CustomerDetailsBean implements Serializable{
    @Inject Services service ;
    
    private Customer customer;
    
    public CustomerDetailsBean() {
    }
    
    public String showCustomer(Customer cust){
        if(cust != null){
            customer = cust;
            return "show";
        }else{
            customer = null;
            return "error";
        }
    }
    
    public List<Account> getAccounts(){
        if(customer == null){
            return new ArrayList();
        }      
        return new ArrayList(customer.getAccounts().values());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
