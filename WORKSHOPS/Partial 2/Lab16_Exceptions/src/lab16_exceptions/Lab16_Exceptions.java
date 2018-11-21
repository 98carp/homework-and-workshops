
package lab16_exceptions;

import ec.edu.espe.lab15.model.Animal;
import ec.edu.espe.lab15.operations.Operation;

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
        
        Animal animal = null;
        
        System.out.println("--> "+animal.eyes);
        
        
        
        
        
        
    }
    
}
