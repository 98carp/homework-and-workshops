
package ec.edu.espe.lab15.operations;

/**
 *
 * @author Sebastian Landazuri
 */
public class Operation {
    
    public float divide(float dividend,float divider){
        float quotien;
        
        quotien=dividend/divider;
        
       return quotien;
    }
    
    public short add(short num1,short num2){
        short result;
        result=(short) (num1+num2);
        return result;
    }
    
     public float add(float num1,float num2){
        float result;
        result=num1+num2;
        return result;
    }
    
}
