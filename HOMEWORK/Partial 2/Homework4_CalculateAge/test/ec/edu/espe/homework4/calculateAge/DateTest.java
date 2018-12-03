/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.homework4.calculateAge;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class DateTest {
    
    public DateTest() {
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
     * Test of calculateAge method, of class Date.
     */
    @Test
    public void testCalculateAge() {
        System.out.println("calculateAge");
        int Day = 0;
        int Month = 0;
        int Year = 0;
        Date instance = new Date();
        instance.calculateAge(Day, Month, Year);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CalculateDay method, of class Date.
     */
    @Test
    public void testCalculateDay() {
        System.out.println("CalculateDay");
        int Day = 0;
        int Month = 0;
        int Year = 0;
        Date instance = new Date();
        instance.calculateDay(Day, Month, Year);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculateMonth method, of class Date.
     */
    @Test
    public void testCalculateMonth() {
        System.out.println("calculateMonth");
        int Day = 0;
        int Month = 0;
        int Year = 0;
        Date instance = new Date();
        instance.calculateMonth(Day, Month, Year);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCal method, of class Date.
     */
   /* @Test
    public void testGetCal() {
        System.out.println("getCal");
        Date instance = new Date();
        Calendar expResult = null;
        Calendar result = instance.getCal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
*/
    /**
     * Test of getOperation method, of class Date.
     */
    /*@Test
    public void testGetOperation() {
        System.out.println("getOperation");
        Date instance = new Date();
        Operation expResult = null;
        Operation result = instance.getOperation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }*/

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDayLife method, of class Date.
     */
    @Test
    public void testGetDayLife() {
        System.out.println("getDayLife");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getDayLife();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMonthLife method, of class Date.
     */
    @Test
    public void testGetMonthLife() {
        System.out.println("getMonthLife");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getMonthLife();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getAge method, of class Date.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Date instance = new Date();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int Day = 0;
        Date instance = new Date();
        instance.setDay(Day);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int Month = 0;
        Date instance = new Date();
        instance.setMonth(Month);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setYear method, of class Date.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int Year = 0;
        Date instance = new Date();
        instance.setYear(Year);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDayLife method, of class Date.
     */
    @Test
    public void testSetDayLife() {
        System.out.println("setDayLife");
        int dayLife = 0;
        Date instance = new Date();
        instance.setDayLife(dayLife);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMonthLife method, of class Date.
     */
    @Test
    public void testSetMonthLife() {
        System.out.println("setMonthLife");
        int monthLife = 0;
        Date instance = new Date();
        instance.setMonthLife(monthLife);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAge method, of class Date.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Date instance = new Date();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
       @Test
    public void testAddSimpleCases(){
        int year=1997;
        int month=3;
        int day=27;
        int expectedResultYear=21;
        int expectedResultMonth=8;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
           System.out.println("");
        
    }
    
    @Test
    public void ceroMonth(){
        int year=1997;
        int month=0;
        int day=27;
        int expectedResultYear=21;
        int expectedResultMonth=-1;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
   
    }
    @Test
    public void ceroYear(){
        int year=0;
        int month=3;
        int day=27;
        int expectedResultYear=-1;
        int expectedResultMonth=8;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void ceroDay(){
        int year=1997;
        int month=3;
        int day=0;
        int expectedResultYear=21;
        int expectedResultMonth=8;
        int expectedResultDay=-1;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void negativeYear(){
        int year=-2;
        int month=3;
        int day=27;
        int expectedResultYear=-1;
        int expectedResultMonth=8;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void negativeMonth(){
        int year=1997;
        int month=-2;
        int day=27;
        int expectedResultYear=21;
        int expectedResultMonth=-1;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void negativeDay(){
        int year=1997;
        int month=3;
        int day=-2;
        int expectedResultYear=21;
        int expectedResultMonth=8;
        int expectedResultDay=-1;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }   
    @Test
    public void wrongYear(){
        int year=2030;
        int month=3;
        int day=27;
        int expectedResultYear=-1;
        int expectedResultMonth=8;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void wrongMonth(){
        int year=1997;
        int month=14;
        int day=27;
        int expectedResultYear=21;
        int expectedResultMonth=-1;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void wrongDay(){
        int year=1997;
        int month=3;
        int day=40;
        int expectedResultYear=21;
        int expectedResultMonth=8;
        int expectedResultDay=-1;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void CharYear(){
        int year='m';
        int month=3;
        int day=27;
        int expectedResultYear=-1;
        int expectedResultMonth=8;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void charMonth(){
        int year=1997;
        int month='s';
        int day=27;
        int expectedResultYear=21;
        int expectedResultMonth=-1;
        int expectedResultDay=6;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    @Test
    public void charDay(){
        int year=1997;
        int month=3;
        int day='d';
        int expectedResultYear=21;
        int expectedResultMonth=8;
        int expectedResultDay=-1;
        int actualResultYear;
        int actualResultMonth;
        int actualResultDay;
        Date date = new Date();
        
        date.calculateDay(day, month, year);
        date.calculateMonth(day, month, year);
        date.calculateAge(day, month, year);
        actualResultYear=date.getAge();
        actualResultMonth=date.getMonthLife();
        actualResultDay=date.getDayLife();
        
        assertEquals(expectedResultYear,actualResultYear);
        assertEquals(expectedResultMonth,actualResultMonth);
        assertEquals(expectedResultDay,actualResultDay);
        
        System.out.println(year+" /"+month+" /"+day+" = "+" "+actualResultYear+" /"+actualResultMonth+" /"+actualResultDay);
        System.out.println("");
    }
    
}
