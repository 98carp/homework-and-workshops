
package ec.edu.espe.homework4.calculateAge.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author USUARIO
 */
public class FileAge {
    public void SaveFile(File file, String inString){
   
        try{
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file,true));
            buffWriter.newLine();
            buffWriter.write(inString);
            buffWriter.close();
         
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
        
    }  
    
    public void ReaderFile(File file){
                String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }


    
}
