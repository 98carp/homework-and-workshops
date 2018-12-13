/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab20.model;

/**
 *
 * @author Sebastian Landazuri
 */
public class Atlhetic {
    
    private float tiempo;
    private String nombre;
    private int numeroCompetencia;

    public Atlhetic(float tiempo, String nombre, int numeroCompetencia) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.numeroCompetencia = numeroCompetencia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCompetencia() {
        return numeroCompetencia;
    }
    
    public int menortiempo(Atlhetic jugador[]){
        int indice=0;
        float tiempo;
        
        tiempo=jugador[0].getTiempo();
        
        for(int i=1;i<5;i++){
            if(jugador[i].getTiempo()<tiempo){
                tiempo=jugador[i].getTiempo();
                indice=i;
            }
        }
        return indice;
        
    }
    
}
