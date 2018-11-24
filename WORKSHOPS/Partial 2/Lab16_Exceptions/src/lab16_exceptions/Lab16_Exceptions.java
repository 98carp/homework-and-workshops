
package lab16_exceptions;

import ec.edu.espe.lab15.model.Animal;
import ec.edu.espe.lab15.operations.Operation;
import java.io.IOException;

/**
 *
 * @author Sebastian Landazuri
 */
public class Lab16_Exceptions {

    public static void main(String[] args) {
        
        Operation operation=new Operation();
        float result;
        
        result=operation.divide(5.8f,0);
        System.out.println("The quotien is: "+result);
        result=operation.divide(5.8f,3.2f);
        System.out.println("The quotien is: "+result);
        
        result=operation.add((short)35000,(short)23000);
        System.out.println("The result of short is: "+result);
         result=operation.add((short)3,(short)2);
        System.out.println("The result of short is: "+result);
        result=operation.add(1.2f,2.9f);
        System.out.println("The result of float is: "+result);
        result=operation.add(1.2f,2.2f);
        System.out.println("The result of float is: "+result);
        
        System.out.println("");
        Animal animal = null;
        animal = new Animal();
        
        if(animal != null){
            System.out.println("The animal Exist");
        }else{
            System.out.println("The animal does not exist");
        }
        
        System.out.println("");
        try{
            System.out.println("The first animal runs");
            System.out.println("--> "+animal.eyes);
            System.out.println("The program is still running");
        }catch(NullPointerException ex){
           
            animal = new Animal();
            if(animal.eyes!=null){
                System.out.println(""+animal.eyes);
            }else{
                animal.eyes="brown";           
                System.out.println("The hourse has "+animal.eyes+" eyes");
            }
        
            
            
            
            /*System.out.println("An error ocurred "+ex);
            System.out.println("The exception is running "+ex.getMessage());
            System.out.println("StrackTrace  "+ex.getStackTrace());
            System.out.println("StrackTrace error  ");
            ex.printStackTrace();
            if(ex.toString().equals("java.lang.NullPointerException")){
                System.out.println("No animal created");
            }*/
        }finally{
           // System.out.println("After the exception");
            System.out.println("The hourse has brown eyes");
        } 
          Animal animal2 = new Animal();
          
          
        System.out.println("This is the barn number "+animal.getBarnNumber());
        
         animal.asignBarnNumber(18);
        
        System.out.println("This is the barn number for animal 2 "+animal2.getBarnNumber());
        
       
        
        
        
        
        
        
    }
    
}
