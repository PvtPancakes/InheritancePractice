/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Erik
 */
public class HourlyEmployee extends Employee {
    
    private int hoursWorked;
    private double wage;
    
    public HourlyEmployee(String name, String empNo, int age, double wage){
        super.setName(name);
        super.setEmpNo(empNo);
        super.setAge(age);
        this.wage = wage;
    }
    
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double getPay(){
        return hoursWorked * wage;
    }
    
}
