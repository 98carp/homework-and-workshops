
package ec.edu.espe.lab15.model;

import ec.edu.espe.lab15.Interfaces.Animal;

/**
 *
 * @author Sebastian Landazuri
 */
public class Mammal implements Animal{

    @Override
    public void feed() {
        System.out.println("Fedding a mammal with milk and meat ");
    }

    @Override
    public void asignHabitat() {
        System.out.println("The cage is assigned to a mammal");
    }
    
}
