/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_lab10;

import java.util.Calendar;

/*
 * @author Sebastian Landazuri
 */
public class Person {
    
    private final Calendar cal;
    private final Operation operation;
    private int Day,Month,Year,dayLife,monthLife;
    private int age;

    public void calculateAge(int Day, int Month, int Year){
        
        age = operation.sub(cal.get(Calendar.YEAR),this.Year);
    }
    
    public void CalculateDay(int Day, int Month, int Year){
        
        dayLife=operation.sub(cal.get(Calendar.DAY_OF_MONTH), Day);
        
        if(dayLife < 0)
            dayLife=dayLife+30;               
    }
    
    public void calculateMonth(int Day, int Month, int Year){
        
        if(Month >= (1 + cal.get(Calendar.MONTH)) 
                && (Day >= cal.get(Calendar.DAY_OF_MONTH))){
            this.Year = operation.add(Year,1);
        }
        else 
            this.Year = Year;
        
        if((operation.sub(cal.get(Calendar.MONTH) + 1, Month) <= 0) 
                && (Day >= 30))
            Month++;
        if(Day >= 30)
            Month++;
            
        monthLife = operation.sub(cal.get(Calendar.MONTH) + 1, Month);
        
        if (dayLife>cal.get(Calendar.DAY_OF_MONTH)) 
            monthLife=monthLife-1;
         
        if(monthLife <= 0)
            monthLife = operation.add(12, monthLife);
        
    }
    
    public Person() {
        operation = new Operation();
        cal = Calendar.getInstance(); 
    }

    public Calendar getCal() {
        return cal;
    }

    public Operation getOperation() {
        return operation;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public int getDayLife() {
        return dayLife;
    }

    public int getMonthLife() {
        return monthLife;
    }

    public int getAge() {
        return age;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setDayLife(int dayLife) {
        this.dayLife = dayLife;
    }

    public void setMonthLife(int monthLife) {
        this.monthLife = monthLife;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
 
}
    