
package ec.edu.espe.lab15.model;

/**
 *
 * @author Sebastian Landazuri
 */
public class Animal {
 
    public String eyes;
    public static int barnNumber=7;

    public int getBarnNumber() {
        return barnNumber;
    }
    
    
    
    public void feed(){
        System.out.println("The animal is eating");
    }
    
    public  void asignBarnNumber(int bN){
        barnNumber=bN;
    }
    
    
}
