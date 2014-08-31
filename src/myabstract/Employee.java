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
public abstract class Employee {
    
    private String name;
    private String empNo;
    private int age;
    
    public abstract double getPay();

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
