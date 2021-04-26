package adventure;

// Hero gets its implementation of "fight()" from its base class ActionCharacter 
// and this is how Hero implements the CanFight interface
public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {

        System.out.println("Hero::CanSwim");
    }

    @Override
    public void fly() {

        System.out.println("Hero::CanFly");
    }
}
