/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "customerCreateBean")
@RequestScoped
public class CustomerCreateBean {

    /**
     * Creates a new instance of CustomerCreateBean
     */
    private Customer customer;
    
    @Inject Services services;
    public void CreateCustomer(){
        services.saveCustomer(customer.getNumber(),customer.getFirstName(),customer.getLastName());
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
}