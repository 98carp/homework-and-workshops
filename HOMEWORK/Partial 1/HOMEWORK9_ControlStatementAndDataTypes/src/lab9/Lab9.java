/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import ec.edu.espe.lab9.Person;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int day=1,month,year;
        String name;
        
       System.out.println("Ingrese su nombre");
        name=leer.next();
        do{
        System.out.println("Ingrese su año de nacimiento");
        year=leer.nextInt();
        }while(year<=1918||year>2018);
        
        do{
        System.out.println("Ingrese su mes de nacimiento");
        month=leer.nextInt();         
        }while(month<=0||month>12);
        
        do{
        switch (month){
            case 1: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;
            case 2: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>28);
                break;    
            case 3: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;    
            case 4: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>30);
                break;    
            case 5: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;
            case 6: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>30);
                break;    
            case 7: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;
            case 8: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;
            case 9: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>30);
                break;    
            case 10: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;
            case 11: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>30);
                break;    
            case 12: do{
                System.out.println("Ingrese el dia de su nacimiento");
                day=leer.nextInt();
            }while(day<=0||day>31);
                break;    
                
        }
       }while(month<=0||month>12); 
 
        
        Person person = new Person(name,day,month,year);
        
        System.out.println(person.age());
       
        
    }
    
}
