/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.ControlStatementAndDataTypes;

import java.util.Calendar;





/**
 *
 * @author USUARIO
 */
public class Person {
    
    private String name;
    private int day;
    private int month;
    private int year;
     
    

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
 
    
    public String age(){
        
        Calendar calendar = Calendar.getInstance();
        
        Operation addOp = new Operation(0,0);
        
        if(month<=calendar.get(Calendar.MONTH)){
        day=Math.abs(addOp.substraction(calendar.get(Calendar.DAY_OF_MONTH),day));
        month=Math.abs(addOp.substraction(calendar.get(Calendar.MONTH), month));
        year=Math.abs(addOp.substraction(calendar.get(Calendar.YEAR), year));
        year+=1;
        return " "+name+"\nSu edad es: "+year+" años ";
        
        }else if((day<=calendar.get(Calendar.DAY_OF_MONTH)||day==calendar.get(Calendar.DAY_OF_MONTH))&&month==calendar.get(Calendar.MONTH)){
        day=Math.abs(addOp.substraction(calendar.get(Calendar.DAY_OF_MONTH),day));
        month=Math.abs(addOp.substraction(calendar.get(Calendar.MONTH), month));
        year=Math.abs(addOp.substraction(calendar.get(Calendar.YEAR), year));
        year+=2;
        return " "+name+"\nSu edad es: "+year+" años ";     
        } else{
            
        day=Math.abs(addOp.substraction(calendar.get(Calendar.DAY_OF_MONTH),day));
        month=Math.abs(addOp.substraction(calendar.get(Calendar.MONTH), month));
        year=Math.abs(addOp.substraction(calendar.get(Calendar.YEAR), year));
        year-=1;
         return " "+name+"\nSu edad es: "+year+" años ";           
        }
     
    }
} 
      
        

    

