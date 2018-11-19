
package lab15_interfaces;

import ec.edu.espe.lab15.Interfaces.Animal;
import ec.edu.espe.lab15.model.Mammal;
import ec.edu.espe.lab15.model.Reptile;

/**
 *
 * @author Sebastian Landazuri
 */
public class Lab15_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        
        animal = new Mammal();        
        animal.feed();
        animal.asignHabitat();
     
        animal = new Reptile();
        animal.feed();
        animal.asignHabitat();
        
        
        
    }
    
}
