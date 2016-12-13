/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptest;

import aptest.barkers.Barker;
import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class APtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter your name.");
        String myName = hi.next();
        
        Menu.initialize(myName);
        
        Barker selectedBarker = (Barker) Menu.getUserSelection();
        
        selectedBarker.bark(myName);
        
    }
    
}
