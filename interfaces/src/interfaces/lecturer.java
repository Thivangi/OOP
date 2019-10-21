/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author AsusVivo
 */
public class lecturer implements Speaker {

    @Override
    public void speak() {
       System.out.println("talks object oriented design and programming");
    }
    
}
