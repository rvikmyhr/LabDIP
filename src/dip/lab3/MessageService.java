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
public class MessageService {
    private InputMethod input;
    private OutputMethod output;
    
    public MessageService(InputMethod input, OutputMethod output){
        this.input = input;
        this.output = output;
    }
    
    public void displayMessage(){
        output.outputMessage(input);   
    }
}
