/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptest.barkers;

/**
 *
 * @author Hailey.Jones
 */
public abstract class Barker {
    

    abstract protected void barkLikeMe(String myName);

    public void bark(String myName) {
        this.barkLikeMe(myName);

    }

}
