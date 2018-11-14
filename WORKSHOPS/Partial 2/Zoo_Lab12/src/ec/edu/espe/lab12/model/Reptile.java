/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab12.model;

/**
 *
 * @author Sebastian Landazuri
 */
public class Reptile extends Animal{
    
    protected int numberOfVertebrae;

    public Reptile(int numberOfVertebrae, int id, String scientificName, int arrivalYear) {
        super(id, scientificName, arrivalYear);
        this.numberOfVertebrae = numberOfVertebrae;
    }
    
    public int changeSkin(){
         int timeOfChangeSkin;
        timeOfChangeSkin=(int)(Math.random()*(7-1+1)+1);
        
        return timeOfChangeSkin;
    }

    public int getNumberOfVertebrae() {
        return numberOfVertebrae;
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

    public void setNumberOfVertebrae(int numberOfVertebrae) {
        this.numberOfVertebrae = numberOfVertebrae;
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


















