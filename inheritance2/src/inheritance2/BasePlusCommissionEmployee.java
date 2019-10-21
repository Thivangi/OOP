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



public class BasePlusCommissionEmployee extends commisionEmployee{
    
    
    private int baseSalary;
    
     @Override
     public int calculateSalary()
    {
        return (grossSales*rate)+baseSalary;
    }
}
