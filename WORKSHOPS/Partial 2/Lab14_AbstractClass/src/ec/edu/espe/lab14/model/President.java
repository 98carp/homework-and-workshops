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
public class President extends Staff{
    
    private int universityDegree;

    public President(int universityDegree, String name) {
        super(name);
        this.universityDegree = universityDegree;
    }

    @Override
    public void goToStadium() {
        System.out.println("El presidente "+name+" con titulo de "+universityDegree+" nivel va al estadio");
    }

    @Override
    public void goToStadium1() {
        
    }

    @Override
    public void implementResources() {
       
    }


    
    
}
