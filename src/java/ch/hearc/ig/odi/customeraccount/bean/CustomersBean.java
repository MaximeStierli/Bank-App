/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value="CustomersBean")
@RequestScoped
public class CustomersBean implements Serializable{
    
    @Inject Services services;
    public List<Customer> CustomersList(){
        return services.getCustomersList();
    }
}
