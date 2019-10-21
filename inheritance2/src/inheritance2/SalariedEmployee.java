/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author AsusVivo
 */
public class SalariedEmployee extends Employee {
    private int weeklySalary;
    


    public SalariedEmployee(String id, String name,int salary) {
        super(id, name);
        weeklySalary=salary;
    }
    
    
    
    
    //override the calculate method of the calculatesalary class
    
    @Override
    public int calculateSalary()
    {
        return weeklySalary*4;
    } 



    @Override
    public void printDetails()
{
super.printDetails();;
System.out.println("weekly salary"+weeklySalary);

}

}