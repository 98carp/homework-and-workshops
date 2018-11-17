/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_lab12;

import ec.edu.espe.lab12.model.*;
import ec.edu.espe.lab12.utils.File_Management;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian Landazuri
 */
public class Zoo_Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Animal [] animal = new Animal[4]; 
        File file = new File("Zoo.csv");
        String inString;
        File_Management fileMan = new File_Management();
        
        
        int numberOfNipple,id,arrivalYear,numberOfVertebrae;
        String scientificName;
        
       
       /*for(int i=0;i<4;i++){
            System.out.println("Digite el numero de tetillas del mamifero");
            numberOfNipple=cin.nextInt();
            id=(i+1);
            System.out.println("Digite el nombre cientifico del animal");
            scientificName=cin.next();
            System.out.println("Digite el año en que llego el animal al zoologico");
            arrivalYear=cin.nextInt();
            
            animal[i] = new Mammal(numberOfNipple, id, scientificName, arrivalYear);
            
            System.out.println("");
            
            System.out.println("Digite el numero de vertebras del reptil");
            numberOfVertebrae=cin.nextInt();
            id=(i+2);
            System.out.println("Digite el nombre cientifico del animal");
            scientificName=cin.next();
            System.out.println("Digite el año en que llego el animal al zoologico");
            arrivalYear=cin.nextInt();
            
            animal[i+1] = new Reptile(numberOfVertebrae, id, scientificName, arrivalYear);
        }
        
       */
        animal[0]= new Mammal(2,10,"Vaca",1988);
        animal[1]= new Mammal(1,11,"Perro",1987);
        animal[2]= new Reptile(4,12,"Tiburon",1999);
        animal[3]= new Reptile(1,13,"Serpiente",1986);
       
        for(Animal zoo : animal){
            if(zoo instanceof Mammal){
                inString="\n(Nombre cientifico: "+((Mammal) zoo).getScientificName()
                    +"\nId: "+"; "+((Mammal) zoo).getId()+
                     "\nNumero de pezones: "+"; "+((Mammal) zoo).getNumberOfNipple()+
                     "\nAño en que llego: "+"; "+((Mammal) zoo).getArrivalYear()+
                     "\nAños que lleva en el Zoo: "+"; "+((Mammal) zoo).getYearsOfStay()+
                     "\nCantidad segregada: "+"; "+((Mammal) zoo).quantitySegregate()+
                     "\nTiempo de segregacion: )"+"; "+((Mammal) zoo).timeOfSegregate();
                
                fileMan.SaveFile(file, inString);
                
            }else if (zoo instanceof Reptile){
                inString="\n(Nombre Cientifico: "+"; "+((Reptile) zoo).getScientificName()+
                        "\nNumero de vertebras: "+"; "+((Reptile) zoo).getNumberOfVertebrae()+
                        "\nAño en que llego: "+"; "+((Reptile) zoo).getArrivalYear()+
                        "\nAños que lleva en el Zoo: "+"; "+((Reptile) zoo).getYearsOfStay()+
                        "\nTiempo en cambio de piel: )"+"; "+((Reptile) zoo).changeSkin();
                
                fileMan.SaveFile(file, inString);
            }
        }
        
        
        
 
        
        
        
     }
    
}

























