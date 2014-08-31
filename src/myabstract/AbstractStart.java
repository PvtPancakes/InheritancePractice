package myabstract;

/**
 *
 * @author Erik
 */
public class AbstractStart {
    
    public static void main(String[] args) {
        
        HourlyEmployee emp1 = new HourlyEmployee("Sarah", "0032107", 29, 8.5);
        SalariedEmployee emp2 = new SalariedEmployee("Jeff", "00042111", 32, 50000);
        
        emp1.setHoursWorked(32);
        
        System.out.println(emp1.getName() + ", " + emp1.getEmpNo() + ", " + emp1.getAge() + ", $" + emp1.getPay());
        System.out.println(emp2.getName() + ", " + emp2.getEmpNo() + ", " + emp2.getAge() + ", $" + emp2.getPay());
        
    }
    
}
