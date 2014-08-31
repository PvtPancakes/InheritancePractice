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
public class Employee {
    
    private String name;
    private String empNo;
    private int age;
    
    public Employee(String name, String empNo, int age){
        this.name = name;
        this.empNo = empNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if(age > 0 && age < 130) 
            this.age = age;
        else
            this.age = -1;
    }
    
}
