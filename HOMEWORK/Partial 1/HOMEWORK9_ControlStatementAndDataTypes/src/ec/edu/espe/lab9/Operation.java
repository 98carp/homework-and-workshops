/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9;

/**
 *
 * @author USUARIO
 */
public class Operation {
    private int operand1;
    private int operand2;
    private int result;

   

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public int getResult() {
        return result;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    
     public Operation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }
    
    

    public int add(int operation1, int operation2){
        result=operation1+operation2;
        return  result;
    }
    
    public int substraction(int operand1,int operand2){
        operand2*=-1;
        result=add(operand1,(operand2));
        return result;
    }    
    
   public int multiply(){
        int acum=0;
        int sign=0;
        
        if(operand1<0 ^ operand2<0)
            sign=1;
        
        operand1=Math.abs(operand1);
        operand2=Math.abs(operand2);
        
      for(int i=0; i<=operand2; i++){
          acum+=operand1;
      }
      
      if(sign==1)
         acum*=-1;    

      return acum;
       
    }
    
    public int div(int operand1, int operand2)  {
       int sign=0;
       int acum=0;
       int resto;
        if(operand2==0){
   
            System.out.print("El divisor es cero, no se puede efectuar");
            return 0;
        }
        
        if(operand1<0 ^ operand2<0)
            sign=1;
        
        operand1=Math.abs(operand1);
        operand2=Math.abs(operand2);

        resto=operand1;
        
        while(resto==operand2){
            resto -= operand2;
            acum++;
        }
        
        if(sign==1)
        acum*=-1;    
       
        return acum;
    }
    
}
