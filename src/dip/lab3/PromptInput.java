/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

import javax.swing.JOptionPane;


public class PromptInput implements InputMethod {
    
    private String message;
    
    @Override
    public String inputMessage(){
        message = JOptionPane.showInputDialog("Enter Message");
        return message;
    }
    
}
