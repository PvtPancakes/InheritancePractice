/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Erik
 */
public class HourlyEmployee extends Employee {
    
    private int hoursWorked;
    private double wage;
    
    public HourlyEmployee(String name, String empNo, int age, int hoursWorked, double wage){
        super(name, empNo, age);
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }
    
    public HourlyEmployee(String name, String empNo, int age, double wage){
        super(name, empNo, age);
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    
    public double getPay(){
        return wage * hoursWorked;
    }
    
}
