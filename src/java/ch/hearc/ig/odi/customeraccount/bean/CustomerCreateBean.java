/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "CustomerCreateBean")
@SessionScoped
public class CustomerCreateBean  implements Serializable{

    /**
     * Creates a new instance of CustomerCreateBean
     */
    @Inject Services services;
    private Customer customer = new Customer();

    public CustomerCreateBean() {
    }
    
       
    public int CreateCustomer(){
        services.saveCustomer(customer.getNumber(),customer.getLastName(),customer.getFirstName());
        customer = new Customer();
        return 1;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
    
}
