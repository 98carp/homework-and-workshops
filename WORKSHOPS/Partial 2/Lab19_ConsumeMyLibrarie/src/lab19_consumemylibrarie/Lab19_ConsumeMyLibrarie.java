/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_consumemylibrarie;

import ec.edu.espe.lab19.library.area.Figure;
import ec.edu.espe.lab19.library.area.Triangule;
import ec.edu.espe.lab19.library.operation.BasicOperation;
/**
 *
 * @author Sebastian Landazuri
 */
public class Lab19_ConsumeMyLibrarie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure figure = new Triangule(1,2);
        BasicOperation operation = new BasicOperation(1.2f,2.4f);
        float localArea;
        localArea=figure.computeArea();
        System.out.println("The area is equals to --> "+figure.getArea());
        float resultOperation;
        resultOperation=operation.add();
        System.out.println("The add is equals to --> "+resultOperation);
        resultOperation=operation.division();
        System.out.println("The division is equals to --> "+resultOperation);
        resultOperation=operation.multiplity();
        System.out.println("The multiplity is equals to --> "+resultOperation);
        resultOperation=operation.subtruct();
        System.out.println("The subtruct is equals to --> "+resultOperation);
        
        
        
        
    }
    
    
}
