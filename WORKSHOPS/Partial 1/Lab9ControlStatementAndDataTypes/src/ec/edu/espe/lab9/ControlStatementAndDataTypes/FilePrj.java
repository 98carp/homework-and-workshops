/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.ControlStatementAndDataTypes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sebastian
 */
public class FilePrj {
    
    
    public void save(String fileName,String text){
        
        File file=new File(fileName);
        FileWriter wrt;
        try{
         
         wrt= new FileWriter(file,true);
         wrt.write(text);
         wrt.close();
         
        }catch(IOException e){
            System.err.println("Error, no se pudo crear el archivo");
        }
    }
    
   
    
    
}
