package ec.edu.espe.lab18.tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author TopCoders
 */
public class CircleTest {
    
    public CircleTest() {
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


    public void testComputePerimeter() {
        System.out.println("computePerimeter");
        float radio = 0.0F;
        Circle instance = new Circle();
        float expResult = 0.0F;
        float result = instance.computePerimeter(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    public void testComputeArea() {
        System.out.println("computeArea");
        float radio = 0.0F;
        Circle instance = new Circle();
        float expResult = 0.0F;
        float result = instance.computeArea(radio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testPerimeterZero()
    {
        float radius=0;
        float expectedRadius=-1;
        Circle circ=new Circle();
        float actualResult=circ.computePerimeter(radius);
        assertEquals(expectedRadius,actualResult,0.0f);
        System.out.println("succed");
    }
    
    public void testPerimeterNegative()
    {
        float radius=-1;
        float expectedRadius=-2*(3.1416f);
        Circle circ=new Circle();
        float actualResult=circ.computeArea(radius);
        assertEquals(expectedRadius, actualResult,0.0f);
        System.out.println("succed");
    }
    
    public void testPerimetersChar1()
    {
        float radius=Float.valueOf("true");
        float expectedRadius=0.5f;
        Circle circ=new Circle();
        float actualResult=circ.computeArea(radius);
        assertEquals(expectedRadius, actualResult,0.0f);
        System.out.println("succed");
    }
    
      public void testPerimetersChar2()
    {
        float radius='/';
        float expectedRadius=-10;
        Circle circ=new Circle();
        float actualResult=circ.computeArea(radius);
        assertEquals(expectedRadius, actualResult,0);
        System.out.println("succed");
    }
	
 @Test
    public void testPerimeterOne()
    {
        float radius=1;
        float expectedRadius= 2*(float)3.1416;
        Circle circ=new Circle();
        float actualResult=circ.computeArea(radius);
        assertEquals(expectedRadius, actualResult,0.0001);
        System.out.println("succed");
    }
    @Test
    public void TestCharacteres1Area(){
        float radius='*';
        float pi =3.1416f;
        float expectedResult=-1;
        
        Circle circle = new Circle();
        float actualResult=circle.computeArea(radius);
        assertEquals(expectedResult, actualResult, 0.0f);
        System.out.println(pi+""+radius+""+radius+"="+actualResult+" succeded");
        
    }
    @Test
    public void TestCharacteres2Area(){
        float radius='/';
        float pi =3.1416f;
        float expectedResult=-1;
  
        Circle circle = new Circle();
        float actualResult=circle.computeArea(radius);
        assertEquals(expectedResult,actualResult ,0.0f);
        System.out.println(pi+""+radius+""+radius+"="+actualResult+" succeded");
    }
    @Test
    public void wrongCasesArea(){
        float radius=-1;
        float pi =3.1416f;
        float expectedResult=-1;

        Circle circle = new Circle();
        float actualResult=circle.computeArea(radius);
        assertEquals(expectedResult,actualResult, 0.0f);
        System.out.println(pi+""+radius+""+radius+"="+actualResult+" succeded");
        
    }
    @Test
    public void wrongCases2Area(){
        float radius=0;
        float pi =3.1416f;
        float expectedResult=-1;

        Circle circle = new Circle();
             float actualResult=circle.computeArea(radius);
        assertEquals(expectedResult,actualResult,0.0f);
        System.out.println(pi+""+radius+""+radius+"="+actualResult+" succeded");
    }
    @Test
    public void testSimpleCases(){
        float radius=2.4f;
        float pi =3.1416f;
        float expectedResult=-1;

        Circle circle = new Circle();
          float actualResult=circle.computeArea(radius);
        assertEquals(expectedResult,actualResult,0.0f);
        System.out.println(pi+""+radius+""+radius+"="+actualResult+" succeded");
    }
}
