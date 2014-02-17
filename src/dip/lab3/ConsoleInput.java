/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Ron
 */
public class ConsoleInput implements InputMethod {
    
    private Scanner askInput = new Scanner(System.in);
    private String message;
    
    @Override
    public String inputMessage(){
        System.out.println("Enter message");
        message = askInput.nextLine();
        return message;
    }
    
}
