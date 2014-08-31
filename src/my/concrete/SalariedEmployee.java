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
public class SalariedEmployee extends Employee {
    
    private double annualSalary;
    
    public SalariedEmployee(String name, String empNo, int age, double annualSalary){
        super(name, empNo, age);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
    
}
