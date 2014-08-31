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
        
        emp2.setHoursWorked(32);
        
        System.out.println(emp1.getName() + ", " + emp1.getEmpNo() + ", " + emp1.getAge());
        System.out.println(emp2.getName() + ", " + emp2.getEmpNo() + ", " + emp2.getAge() + ", $" + emp2.getPay());
        
    }
    
}
