/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab14.model;

/**
 *
 * @author USUARIO
 */
public class SubsitePlayers extends Staff{

    public SubsitePlayers(String name) {
        super(name);
    }

    @Override
    public void goToStadium() {
        System.out.println("El jugador "+name+" suplente va al estadio");
    }

    @Override
    public void goToStadium1() {
        
    }

    @Override
    public void implementResources() {
        
    }

   

 
    
    
}
