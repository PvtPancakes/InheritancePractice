package myabstract;

/**
 *
 * @author Erik
 */
public class AbstractStart {
    
    public static void main(String[] args) {
        
        HourlyEmployee emp1 = new HourlyEmployee("Sarah", "0032107", 29, 8.5);
        
        emp1.setHoursWorked(32);
        
        System.out.println(emp1.getName() + ", " + emp1.getEmpNo() + ", " + emp1.getAge() + ", $" + emp1.getPay());
        
    }
    
}
