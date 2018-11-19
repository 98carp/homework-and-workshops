
package ec.edu.espe.lab15.model;

import ec.edu.espe.lab15.Interfaces.Animal;

/**
 *
 * @author Sebastian Landazuri
 */
public class Reptile implements Animal {

    @Override
    public void feed() {
         System.out.println("Fedding a reptile with insects ");
    }

    @Override
    public void asignHabitat() {
        System.out.println("The cage is assigned to a reptile");
    }
    
    
    
}
