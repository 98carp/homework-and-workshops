
package lab18_collections;

import ec.edu.espe.lab18.model.Person;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Sebastian landazuri
 */
public class Lab18_Collections {

    public static void main(String[] args) {
       Collection things;
       things = new ArrayList();
       
       Person person = new Person(1000,"Sebastian",123.4f);
       
       System.out.println("Size at the beginning: "+things.size());
       things.add(18000);
       things.add("Hello Quito");
       things.add(5000.25f);
       things.add(person);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
       System.out.println("");
       
       Object[] thingArray = new Object[things.size()];
       thingArray = things.toArray();
       System.out.println("The three element of the array is: "+thingArray[2]);
       things.remove(5000.25f);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
        System.out.println("");
        
       things.add(3);
       things.add(3);
       things.add(3);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
        System.out.println("");
    
       things.remove(3);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
        System.out.println("");
        
       things.add(5);
       things.add(8);
       things.add(4);
       things.add(8);
       things.add(9);
       things.add(8);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
       System.out.println("");
        
       things.remove(8);
       System.out.println("Size at the end: "+things.size());
       System.out.println("The elements of the list are: "+things.toString()); 
       System.out.println("");
        
        things.remove(person);
        System.out.println("Size at the end: "+things.size());
        System.out.println("The elements of the list are: "+things.toString()); 
        System.out.println("");
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        
        Collection listPerson = new ArrayList();
       
        for (int i=0;i<5;i++){
            listPerson.add(new Person(i+1,"Sebastian"+(i+1),(i+1)*1000));
        }
        
        listPerson.forEach((p) -> {
            System.out.println("Person --> "+p);
        });
        
        
    }
    
}
