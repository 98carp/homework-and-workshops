/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_lab10;


import ec.edu.espe.file_management.util.File_Management;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Sebastian Landazuri
 */
public class Lab10 {
    
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Scanner cin = new Scanner(System.in);
        String name;
        int Day = 0, Month = 0, Year = 0;
        boolean check = false;
        String inString;
         File_Management fileMan = new File_Management();
         File file = new File("Register_Age.csv");
      
        System.out.print("Ingresa el nombre: ");
        name = cin.nextLine();
        
        while (!check){
            System.out.print("Ingrese el dia de nacimiento: ");
            Day = cin.nextInt();
            System.out.print("Ingrese el mes de nacimiento: ");
            Month = cin.nextInt();
            System.out.print("Ingrese el año de nacimiento: ");
            Year = cin.nextInt();

            if (Day<0 || Day>31){
                System.out.println("Dia no encontrado");
                check = true;
            }
            if (Month<0 || Month>12){
                System.out.println("Mes no encontrado");
                check = true;
            }
            if (Year < 0|| Year > cal.get(Calendar.YEAR)){
                System.out.println("Año no encontrado");
                check = true;
            }
            if(Year >= cal.get(Calendar.YEAR)&& Month >= cal.get(Calendar.MONTH)&& Day >= cal.get(Calendar.DAY_OF_MONTH)){
                System.out.println("Todavia no nace ");
                check = true;
            }

            if(check) check = false;
            else check = true;
        }
        
        Person person = new Person();
        ArrayList<Integer> ages = new ArrayList<>();
        person.CalculateDay(Day, Month, Year);
        person.calculateMonth(Day, Month, Year);
        person.calculateAge(Day, Month, Year);
        
        String AgeString=String.valueOf(person.getAge());
        String [] Ages = AgeString.split("\\s");
     
         
        
        System.out.println(name+" Usted tiene \n"+person.getAge()+" años "+person.getMonthLife()+" meses "+person.getDayLife()+" dias"); 
        inString = "("+ name + " ; " + person.getAge() + " ; "+ person.getMonthLife() + " ; " + person.getDayLife()+" ; "+
                 "Nacio el dia: "+Day+" ; "+" el mes: "+Month+" ; "+" el anio: "+Year+"  )";
        
        String arreglo[]=new String [10];
        int conta=0;
        for(int i=0;i<Ages.length;i++){
            System.out.println("-->"+Ages[i]);
            /*arreglo[i]=Ages[i];         
            conta++;
            if(conta==2){
             for(int j=0;j<arreglo.length;j++){
                 System.out.println("-->"+arreglo[j]);
             }
         } */     
      }
        
        fileMan.SaveFile(file, inString);
        fileMan.ReaderFile(file);
        
        
        
        
        

    }
    
    
}
