package ec.edu.espe.lab14.model;

/**
 * @author Victor Jimenez, Sebastian Landazuri
 */
public class Utilities extends Resources {
    
    private float money;

    public Utilities(float money) {
            
    }

    @Override
    public void goToStadium(int cuantity) {
        System.out.println("Utilidades listas para ir al estadio");
    }

    @Override
    public void implementResources(int cuantity) {
          System.out.println("Utilidades listas para ir al estadio de la marca");
        
    }

}
