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
public class Utilities extends Resources{
    
    private float money;

    public Utilities(float money, int quantity) {
        super(quantity);
        this.money = money;
    }

    @Override
    public void goToStadium1() {
        System.out.println("Las utilidades "+quantity+" con $"+money+" van como aportacion al estadio");
    }

    @Override
    public void implementResources() {
        System.out.println("Las utilidades "+quantity+" con $"+money+" son implementadas en el equipo");
    }

    @Override
    public void goToStadium() {
         
    }

    



}
