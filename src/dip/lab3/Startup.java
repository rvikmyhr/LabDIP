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
public class Startup {
    
    public static void main(String[] args) {
        InputMethod input1 = new ConsoleInput();
        OutputMethod output1 = new PromptOutput();
        MessageService message = new MessageService(input1, output1);
        message.displayMessage();
        
    }
}
