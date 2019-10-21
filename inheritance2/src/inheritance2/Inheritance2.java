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
public class Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Employee emp1=new SalariedEmployee("1001","ABC",12000);
        System.out.println(emp1.calculateSalary());
        // TODO code application logic here
    }
    
}
