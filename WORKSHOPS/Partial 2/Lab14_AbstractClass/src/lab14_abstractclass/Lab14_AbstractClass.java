/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_abstractclass;

import ec.edu.espe.lab14.model.*;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Landazuri
 */
public class Lab14_AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        
        animal = new Mammal();
        
        animal.giveBirth();
        
        System.out.println("Animal is a type of --> "+animal.getClass().getSimpleName());
        System.out.println("");
        ArrayList <TeamBallenita> team = new ArrayList<TeamBallenita>();
        
        
        Staff coach = new Coach("Bauza");
        Staff president = new President(3,"Moreno");
        Staff startingPlayers = new StartingPlayers("Benzema");
        Staff subsitePlayerss = new SubsitePlayers("Araujo");
        
        Resources medicalEquipment = new MedicalEqipment("los medicasos",12);
        Resources utilities = new Utilities(12,10);
        
        team.add(coach);
        team.add(president);
        team.add(startingPlayers);
        team.add(subsitePlayerss);
        
        team.add(medicalEquipment);
        team.add(utilities);
        
           for(TeamBallenita teamB : team){
            System.out.println("");
               teamB.goToStadium();
               teamB.goToStadium1();
               teamB.implementResources();
              
               System.out.println("TeamBallenita is a type of --> "+teamB.getClass().getSimpleName());
           }
        
    }

    
}

