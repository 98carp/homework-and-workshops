/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab12.model;
import ec.edu.espe.lab12.model.*;
/**
 *
 * @author Sebastian Landazuri
 */
public class Mammal extends Animal {
    
    protected int numberOfNipple;

    public Mammal(int numberOfNipple, int id, String scientificName, int arrivalYear) {
        super(id, scientificName, arrivalYear);
        this.numberOfNipple = numberOfNipple;
    }
    
    public int quantitySegregate(){
        
       int quantityOfSegregateMilk;
        quantityOfSegregateMilk=(int)(Math.random()*(7-1+1)+1);
        
        return quantityOfSegregateMilk;
    }
    
    public int timeOfSegregate(){
        int timeOfSegregate;
        timeOfSegregate=(int)(Math.random()*(7-1+1)+1);
        
        
        return timeOfSegregate;
    }

    public int getNumberOfNipple() {
        return numberOfNipple;
    }

    public int getId() {
        return id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public int getArrivalYear() {
        return arrivalYear;
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }

    public void setNumberOfNipple(int numberOfNipple) {
        this.numberOfNipple = numberOfNipple;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public void setYearsOfStay(int yearsOfStay) {
        this.yearsOfStay = yearsOfStay;
    }
    
    
}





