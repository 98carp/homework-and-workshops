package homework_guiproyect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
     * @author Sebastian Landazuri G.
 */

public class StoreHouse {
    
   private int numberAdd=0;
   private int numberDelete; 
   
   
   public StoreHouse()
   {
   }
   /**
    * Method that add clothe to inventory system trough of file
    * @param clothes ClothinItem recieves all atributes of the class ClothingItem
    */
      public void addClothesToFile(ClothingItem clothes)
   {
       FilePrj file=new FilePrj();
       String text;
       String fileName="StoreHouse.csv";
       file.exists(fileName);
       text= file.convertsToString(clothes);
       file.save(fileName,text);
       JOptionPane.showMessageDialog(null,"Se ha agregado correctamente al archivo");
       
   } 
      
     
 
    public int getClothesNumberAdd() {
        return numberAdd;
    }

    public void setClothesNumberAdd(int clothesNumberAdd) {
        this.numberAdd = clothesNumberAdd;
    }

    public int getClothesNumberDelete() {
        return numberDelete;
    }

    public void setClothesNumberDelete(int clothesNumberDelete) {
        this.numberDelete = clothesNumberDelete;
    }
}
