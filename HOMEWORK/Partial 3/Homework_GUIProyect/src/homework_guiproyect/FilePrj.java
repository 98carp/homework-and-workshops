package homework_guiproyect;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Sebastian Landazuri G.
 */

public class FilePrj {
    
    public void save(String fileName, String text)
    {
        try
        {
             File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
                 }
             FileWriter wr=new FileWriter(file.getAbsoluteFile(),true);
             BufferedWriter bw = new BufferedWriter(wr);
             wr.write(text+"\n");
             wr.close();
             bw.close();
        } catch (IOException e)  {
          System.out.println("ERROR: No se pudo escribir en el archivo");
        }
       
    }
    
    public void read(String fileName)
    {
        
        File file =new File(fileName);
        FileReader fileread;
        BufferedReader buffer;
        
           if (!file.exists()) {
              System.out.println("ERROR: El archivo no existe");
              return;
              }
   
        try {
	   fileread = new FileReader(file);
	   buffer = new BufferedReader(fileread);
	   String lines;
         while((lines=buffer.readLine())!=null) {
	       System.out.println(lines);
               }
         fileread.close();
        } catch (IOException e) {
           System.out.println("ERROR: No se pudo abrir el archivo");
            
       }
     
    }
    
    
    
    
    public boolean searchString(String fileName, String request)
    {

        File file =new File(fileName);
          if (!file.exists()) {
              return false;
              }
      try {    
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   rd.close();
                    return true;
                 } 
        
            }
             rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
            return false;
    }
    
    
        public String convertsToString(ClothingItem clothes)
    {
        String text;
        text=clothes.getQuantity()+";"+clothes.getType()+";"+clothes.getSize()+";"+clothes.getColor()+";"+clothes.getGender()+";"+clothes.getPrice()+";";
        
        return text;
    
    }

        public void exists(String fileName)
    { 
        File file =new File(fileName);
        if(fileName=="Ticket.txt" || fileName.equals("Ticket.txt"))
            {
               if (!file.exists()) {
                  this.save(fileName,"0");
                  return;
             }
            }
        if(fileName=="StoreHouse.csv" || fileName.equals("StoreHouse.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="Quantity;Tipe;Size;Color;Gender;Price";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="SalesMoney.csv" || fileName.equals("SalesMoney.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="0";
                   this.save(fileName,text);
                  return;
             }
            }
        if(fileName=="Customer.csv" || fileName.equals("Customer.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="NameAndSurname;Id;Phone;Adress";
                   this.save(fileName,text);
                  return;
             }
         }
    }
    public void outLine(String fileName, String request)
    {
         File file =new File(fileName);
          if (!file.exists()) {
              return;
              }
         try {
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   System.out.println(line);
                 } 
         
            }
            rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
    }


  
   
}