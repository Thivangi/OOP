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
public class HourlyEmployee extends Employee{
    private int wage;
    private int hours;
    
    
    
     @Override
     public int calculateSalary()
    {
        
        int salary=0;
        if(hours<=40)
        {
        return wage*hours;
        }
        
        
       else if(hours>40)
                {
                    return (int) (wage*40+(hours-40)*wage*1.5);
                }
        return salary;
    }
}
