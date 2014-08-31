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
public class SalariedEmployee implements Employee{
    
    private String name;
    private String empNo;
    private int age;
    private double annualSalary;
    
    public SalariedEmployee(String name, String empNo, int age, double annualSalary){
        this.name = name;
        this.empNo = empNo;
        this.age = age;
        this.annualSalary = annualSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmpNo() {
        return empNo;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getPay() {
        return annualSalary;
    }
    
    
    
}
