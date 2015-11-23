/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "customersBean")
@RequestScoped
public class CustomersBean implements Serializable{

    public List<Customer> getListCustomers(){
        Services services = new Services();
        List<Customer> customers = services.getCustomersList();
        return customers;
    }
    
}
