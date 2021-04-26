/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author joyce
 */
public class Cat extends Animal {
    


    @Override
    public String sayHello() {
        return sayHello() + " by Cat"; //To change body of generated methods, choose Tools | Templates.
    }
    

    
   
    public static void main(String[] args) {
        System.out.println(new Cat().sayHello());
    }
    
}
