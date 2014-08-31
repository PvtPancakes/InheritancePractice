package my.concrete;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Erik
 */
public class ConcreteStart {

    public static void main(String[] args) {
            
        Employee emp1 = new Employee("Tim", "0032103", 34);
        HourlyEmployee emp2 = new HourlyEmployee("Sarah", "0032107", 29, 8.5);
        SalariedEmployee emp3 = new SalariedEmployee("Jeff", "00042111", 32, 50000);
        SalaryPlusCommissionEmployee emp4 = new SalaryPlusCommissionEmployee("Barry", "00042108", 38, 60000);
        
        emp2.setHoursWorked(32);
        emp4.setCommission(10000);
        
        System.out.println(emp1.getName() + ", " + emp1.getEmpNo() + ", " + emp1.getAge());
        System.out.println(emp2.getName() + ", " + emp2.getEmpNo() + ", " + emp2.getAge() + ", $" + emp2.getPay());
        System.out.println(emp3.getName() + ", " + emp3.getEmpNo() + ", " + emp3.getAge() + ", $" + emp3.getAnnualSalary());
        System.out.println(emp4.getName() + ", " + emp4.getEmpNo() + ", " + emp4.getAge() + ", $" + emp4.getTotalPay());
        
    }
    
}
