/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptest;

import aptest.barkers.PersonalBarker;
import aptest.barkers.MouseBarker;
import aptest.barkers.ExitBarker;
import aptest.barkers.DogBarker;
import aptest.barkers.CatBarker;
import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class Menu {
    static Scanner scan = new Scanner(System.in);
    static int choice;
    
    
    public static int initialize(String myName){    
    System.out.println("Choose an option");
        System.out.println("1. Bark like " + myName);
        System.out.println("2. Bark like a dog");
        System.out.println("3. Bark like a cat");
        System.out.println("4. Bark like a mouse");
        System.out.println("5. Exit");

        choice = scan.nextInt();

        return choice;

    }

    public static Object getUserSelection() {

        switch (choice) {
            case 1:
                PersonalBarker you = new PersonalBarker();
                return you;
            case 2:
                DogBarker dog = new DogBarker();
                return dog;
            case 3:
                CatBarker cat = new CatBarker();
                return cat;
            case 4:
                MouseBarker mouse = new MouseBarker();
                return mouse;
            case 5:
                ExitBarker exit = new ExitBarker();
                return exit;
            default:
                break;

        }
        return null;
    }

}
