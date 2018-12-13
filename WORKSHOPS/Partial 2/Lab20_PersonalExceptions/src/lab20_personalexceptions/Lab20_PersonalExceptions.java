/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_personalexceptions;

import ec.edu.espe.lab20.exceptions.ExceptionPersonal;
import ec.edu.espe.lab20.model.Atlhetic;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Landazuri
 */
public class Lab20_PersonalExceptions {

    public void compute() throws ExceptionPersonal{
        String nombre;
        int numeroCompetencia,menorTiempo;
        float tiempo=0;
      
        Atlhetic jugador[]=new Atlhetic[5];
       Atlhetic indice = new Atlhetic(2,"s",5);
    
        for(int i=0;i<5;i++){
          nombre=JOptionPane.showInputDialog("Ingrese el nombre del participante : "+"< "+(i+1)+" >");   
          do{
              
          numeroCompetencia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de participante: "));
          if(numeroCompetencia==0){
              throw new ExceptionPersonal();
          }
          }while(numeroCompetencia<0);
          
               
          tiempo=(float)(Math.random()*(8-2+1)+2);
          jugador[i]=new Atlhetic(tiempo,nombre,numeroCompetencia);
        }
        
        menorTiempo=indice.menortiempo(jugador);
        
        for(int j=0;j<5;j++){
            JOptionPane.showMessageDialog(null,"PARTICIPANTE < "+(j+1)+" >"+"\nNombre: "+jugador[j].getNombre()
                        +"\nNumero de participante: "+jugador[j].getNumeroCompetencia()
                                            +"\nTiempo: "+jugador[j].getTiempo());
        }
        
        JOptionPane.showMessageDialog(null,"El menor tiempo fue : "+"\nNombre: "+jugador[menorTiempo].getNombre()+"\nNumero de participante: "+jugador[menorTiempo].getNumeroCompetencia()
                                            +"\nTiempo: "+jugador[menorTiempo].getTiempo());
    }
    
    
    
    
    public static void main(String[] args) {
            
        Lab20_PersonalExceptions test = new Lab20_PersonalExceptions();
        
        try{
        test.compute();
        }catch(ExceptionPersonal s){
            System.out.println("Ocurrio una excepccion "+"\nHa introducido el numero cero");
        }
       
    }
  
}