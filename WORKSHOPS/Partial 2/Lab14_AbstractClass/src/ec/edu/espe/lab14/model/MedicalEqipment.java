/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab14.model;

/**
 *
 * @author Sebastian Landazuri
 */
public class MedicalEqipment extends Resources{
 
    private String medicalTeamName;

    public MedicalEqipment(String medicalTeamName, int quantity) {
        super(quantity);
        this.medicalTeamName = medicalTeamName;
    }

    @Override
    public void goToStadium1() {
        System.out.println("El equipo medico de nombre "+medicalTeamName+" con "+quantity+" de medicinas va al etadio");
    }

    @Override
    public void implementResources() {
        System.out.println("El equipo medico de nombre "+medicalTeamName+" con "+quantity+" de medicinas implementa sus recursos");
    }

    @Override
    public void goToStadium() {
      
    }

   

    
    
}
