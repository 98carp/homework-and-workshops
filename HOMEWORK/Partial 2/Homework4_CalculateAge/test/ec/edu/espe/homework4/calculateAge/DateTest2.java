/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.homework4.calculateAge;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sebastian Landazuri
 */
public class DateTest2 {
    @Test
    public void wrongDay(){
        int year=2015;
        int month=2;
        int day=29;
        int expectedResultYear=-1;
        int expectedResultMonth=-1;
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
    public void wrongDay2(){
        int year=2016;
        int month=4;
        int day=31;
        int expectedResultYear=-1;
        int expectedResultMonth=-1;
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
    public void wrongDay3(){
        int year=2013;
        int month=11;
        int day=31;
        int expectedResultYear=-1;
        int expectedResultMonth=-1;
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
    public void wrongDay4(){
        int year=1970;
        int month=12;
        int day=17;
        int expectedResultYear=47;
        int expectedResultMonth=11;
        int expectedResultDay=26;
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
    public void wrongDay5(){
        int year=1970;
        int month=12;
        int day=17;
        int expectedResultYear=47;
        int expectedResultMonth=11;
        int expectedResultDay=27;
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
    public void wrongDay6(){
        int year=1970;
        int month=12;
        int day=13;
        int expectedResultYear=48;
        int expectedResultMonth=0;
        int expectedResultDay=0;
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
