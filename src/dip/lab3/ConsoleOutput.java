/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

/**
 *
 * @author Ron
 */
public class ConsoleOutput implements OutputMethod {
    
    @Override
    public void outputMessage(InputMethod input){
        System.out.println(input.inputMessage());
    }
}
