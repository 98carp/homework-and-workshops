/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sebastian Landazuri
 */
public class Animal {
    protected int id;
    protected String scientificName;
    protected int arrivalYear;
    protected int yearsOfStay;
    
    public int computeYearsOfStay(int CurrYear)
    {
        GregorianCalendar year = new GregorianCalendar();
      
        return year.get(Calendar.YEAR)-CurrYear;
    }
    
    public Animal(int id, String scientificName, int arrivalYear) {
        this.id = id;
        this.scientificName = scientificName;
        this.arrivalYear = arrivalYear;
       
    }
    
}














