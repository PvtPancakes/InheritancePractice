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
public class SalaryPlusCommissionEmployee extends SalariedEmployee implements Employee{
    
    private double commission;
    
    public SalaryPlusCommissionEmployee(String name, String empNo, int age, double annualSalary){
        super(name, empNo, age, annualSalary);
    }
    
    public void setCommission(double commission){
        this.commission = commission;
    }
    
    @Override
    public double getPay(){
        return super.getPay() + commission;
    }

}
