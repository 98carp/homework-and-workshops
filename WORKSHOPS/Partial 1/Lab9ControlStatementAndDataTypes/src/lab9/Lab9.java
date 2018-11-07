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
        
        int day,month,year;
        String name;
        
       System.out.println("Ingrese su nombre");
        name=leer.next();
        System.out.println("Ingrese el dia de su nacimiento");
        day=leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        month=leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        year=leer.nextInt();
        
        Person person = new Person(name,day,month,year);
        
        System.out.println("Su edad es: "+person.age());
       
        
    }
    
}
