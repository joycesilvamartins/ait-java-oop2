/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horrorshow;

/**
 *
 * @author joyce
 */
public class StrangeMonster implements Vampire {

  
    @Override
    public void drinkBlood() {
        System.out.println("StrangeMonster::drinkBlood");
    }

    @Override
    public void destroy() {
        System.out.println("StrangeMonster::destroy");
    }

    @Override
    public void menace() {
        System.out.println("StrangeMonster::menace");
    }

    @Override
    public void kill() {
        System.out.println("StrangeMonster::kill");
    }
    
}
