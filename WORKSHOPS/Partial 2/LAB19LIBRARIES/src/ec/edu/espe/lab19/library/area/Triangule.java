/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab19.library.area;

/**
 *
 * @author Sebastian Landazuri
 */
public class Triangule extends Figure{
    private float height;
    private float base;

    public Triangule(float height, float base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public float computeArea() {
       area=(base*height)/2;
       return area;
    }
    
    
}
