
package ec.edu.espe.lab14.model;
/**
 * @author Arkano036
 */
public class MedicalEquipment extends Resources {

   private String medicalTeamName;
    
    @Override
    public void goToStadium(int cuantity) {
        System.out.println("Equipo medico listo para ir al estadio de la marca"+ medicalTeamName);
    }
   @Override
    public void implementResources(int cuantity) {
        System.out.println("Recursos medicos implementados de la marca"+medicalTeamName);
    }
    
}
