package ec.edu.espe.lab14.model;

/**
 * @author Victor Jimenez, Sebastian Landazuri
 */
public class President extends Staff {

    private int universityDegree;
    
    @Override
    protected void goToStadium(String NameS) {
       name=NameS;
        System.out.println(name+"esta en el estadio");
    }
    
}
