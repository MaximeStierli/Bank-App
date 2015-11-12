/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value="indexBean") 
@RequestScoped
public class IndexBean implements Serializable {

   
    public IndexBean() {}
    
    public void languageToFr(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRENCH);
    }
    
    public void languageToEn(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.ENGLISH);
    }
    
}

