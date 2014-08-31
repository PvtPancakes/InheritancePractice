/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Erik
 */
public class HourlyEmployee implements Employee {
    
    private String name;
    private String empNo;
    private int age;
    private int hoursWorked;
    private double wage;
    
    public HourlyEmployee(String name, String empNo, int age, double wage){
        this.name = name;
        this.empNo = empNo;
        this.age = age;
        this.wage = wage;
    }
    
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getEmpNo(){
        return empNo;
    }
    
    @Override
    public int getAge(){
        return age;
    }
    
    @Override
    public double getPay(){
        return hoursWorked * wage;
    }
    
    @Override
    public void setAge(int age){
        if(age > 0 && age < 130) 
            this.age = age;
        else
            this.age = -1;
    }
    
}
