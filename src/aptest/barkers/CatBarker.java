/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptest.barkers;

import aptest.barkers.Barker;

/**
 *
 * @author Hailey.Jones
 */
public class CatBarker extends Barker{
   
    @Override
    protected void barkLikeMe(String myName) {
        System.out.println("Bark, bark - I am a cat");
    }
}
