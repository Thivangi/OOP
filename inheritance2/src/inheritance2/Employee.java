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
public class Employee {
    
    protected String id;
    protected String name;
    
    
    public Employee(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int calculateSalary()
    {
        return 0;
    }
    
    public void printDetails()
    {
        System.out.println("weekly slary:"+name);
                System.out.println("weekly slary:"+id);

        
    }
    
}
