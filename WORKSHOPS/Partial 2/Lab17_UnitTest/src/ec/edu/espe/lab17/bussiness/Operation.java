
package ec.edu.espe.lab17.bussiness;

/**
 *
 * @author Sebastian Landazuri
 */
public class Operation {
 
    private short operand1;
    private short operand2;
    private short result;
    
    public short add(short addent1,short addent2){
        result=(short) (addent1+addent2);
        return result;
    }
    
}
