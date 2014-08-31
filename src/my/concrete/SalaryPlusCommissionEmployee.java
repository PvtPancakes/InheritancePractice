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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    
    public SalaryPlusCommissionEmployee(String name, String empNo, int age, double annualSalary){
        super(name, empNo, age, annualSalary);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public double getTotalPay(){
        return super.getAnnualSalary() + commission;
    }
    
}
