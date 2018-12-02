/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab17.bussiness;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Landazuri
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short addent1 = 0;
        short addent2 = 0;
        Operation instance = new Operation();
        short expResult = 0;
        short result = instance.add(addent1, addent2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }
    @Test
    public void testAddSimpleCases(){
        short operand1=1;
        short operand2=2;
        short expectedResult=3;
        Operation operation = new Operation();
        
        short actualResult=operation.add(operand1, operand2);
        
        
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        
        
        operand1=2;
        operand2=-1;
        expectedResult=1;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        
    }
    
    @Test
    public void wrongCases(){
        short operand1=32000;
        short operand2=32000;
        int expectedResult=64000;
        Operation operation = new Operation();
        
        short actualResult=operation.add(operand1, operand2);
        
        
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        
        
        operand1=2;
        operand2=-1;
        expectedResult=1;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        
    }
    
    @Test
    public void TestCharacteres(){
        /*char operand1='1';
        char operand2='2';
        int expectedResult=3;
        Operation operation = new Operation();
        
        short actualResult=operation.add((short)operand1,(short)operand2);
        
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        */
        short operand1='1';
        short operand2='2';
        int expectedResult=3;
        Operation operation = new Operation();
        
        short actualResult=operation.add(operand1,operand2);
        
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1+"+"+operand2+"= "+actualResult+" succeded");
        
       
    }
    
}
