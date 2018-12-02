
package homework4_calculateage;

import ec.edu.espe.homework4.calculateAge.Date;
import ec.edu.espe.homework4.calculateAge.files.FileAge;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Sebastian Landazuri
 */
public class Homework4 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Scanner cin = new Scanner(System.in);
        String name="w";
        int day = 0, month = 0, year = 0;
        String inString;
        FileAge fileMan = new FileAge();
        File file = new File("Register_Age.csv");
      
        try{
        System.out.print("Ingresa el nombre: ");
        name = cin.nextLine();
        }catch(Exception ex){
            System.out.println("Dato erroneo");
        }
        
        
           try{
            do{
            System.out.print("Ingrese el año de nacimiento: ");
            year = cin.nextInt();
            }while(year<=1900||year>cal.get(Calendar.YEAR));
           }catch(Exception ex){
               System.out.println("Dato erroneo");
               return;
           }
           
              try{
            do{
            System.out.print("Ingrese el mes de nacimiento: ");
            month = cin.nextInt();
            }while(month<=0||month>12);
            }catch(Exception ex){
                System.out.println("Dato erroneo");
                return;
            }
            
            if(month==2&&(year%4==0 && year%100!=0 || year%400==0)){
                
                try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>29);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                        return;
                    }
                   
            }
            
            switch(month){
                case 1: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;
                case 2: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>28);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 3: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 4: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>30);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 5: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 6: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>30);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;  
                case 7: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 8: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>28);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 9: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>30);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 10: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case 11: 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>30);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
                case (12): 
                    try{
                    do{    
                    System.out.print("Ingrese el dia de nacimiento: ");
                    day = cin.nextInt();
                    }while(day<=0||day>31);
                    }catch(Exception ex){
                        System.out.println("Dato erroneo");
                           return;
                    }
                    break;    
            }      
           
             
        Date date = new Date();
        ArrayList<Integer> ages = new ArrayList<>();
        date.CalculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        
        String AgeString=String.valueOf(date.getAge());
        String [] Ages = AgeString.split("\\s");
     
         
        
        System.out.println(name+" Usted tiene \n"+date.getAge()+" años "+date.getMonthLife()+" meses "+date.getDayLife()+" dias"); 
        inString = "("+ name + " ; " + date.getAge() + " ; "+ date.getMonthLife() + " ; " + date.getDayLife()+" ; "+
                 "Nacio el dia: "+day+" ; "+" el mes: "+month+" ; "+" el anio: "+year+"  )";
        
        
        fileMan.SaveFile(file, inString);
        fileMan.ReaderFile(file);
      }
        
        
    }
    

