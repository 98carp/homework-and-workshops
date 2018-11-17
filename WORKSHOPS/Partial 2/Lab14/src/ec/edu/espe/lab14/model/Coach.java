package ec.edu.espe.lab14.model;

/**
 * @author Victor Jimenez, Sebastian Landazuri
 */
public class Coach extends Staff {

    
    protected int YearOfExperience;
    
    @Override
    protected void goToStadium(String NameS){
        
       name=NameS;
        System.out.println(name+"esta en el estadio");
       
    }
   
    
}
