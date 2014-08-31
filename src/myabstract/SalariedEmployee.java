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
public class SalariedEmployee extends Employee {
    
    private double annualSalary;
    
    public SalariedEmployee(String name, String empNo, int age, double annualSalary){
        super.setName(name);
        super.setEmpNo(empNo);
        super.setAge(age);
        this.annualSalary = annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
    
    @Override
    public double getPay(){
        return annualSalary;
    }
    
}
