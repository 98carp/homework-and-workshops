/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9;


/**
 *
 * @author USUARIO
 */
public class Person {
    
    private String name;
    private int day;
    private int month;
    private int year;
    
    public int age(){
        
        int actualYear=2018;
        int actualMonth=5;
        int actualDay=5;
    
        Operation addOp = new Operation(0,0);
        
        if(day>actualDay){
          day=addOp.substraction(day,actualDay);
        }else{
           actualDay=addOp.substraction(actualDay,year);
        }
       
        if(month>actualMonth){
            month=addOp.substraction(month,actualMonth);
        }else{
          actualMonth=addOp.substraction(actualMonth,month);
        }
        
        actualYear=addOp.substraction(actualYear,year);
        
        return 0;
       }
        
    
    
    }

    

