package adventure;

public class Adventure {

    public static void someFight(CanFight cf) {

        cf.fight();

    }

    public static void someSwim(CanSwim cs) {

        cs.swim();
    }

    public static void someFly(CanFly cfl) {

        cfl.fly();
    }

    public static void someAction(ActionCharacter ac) {

        ac.fight();
    }

    public static void main(String[] args) {

        Hero h = new Hero();
        someFight(h);   // Treat it as a CanFight           - "ActionCharacter::fight()"
        someSwim(h);    // Treat it as a CanSwim            - "Hero::swim()"
        someFly(h);     // Treat it as a CanFly             - "Hero::fly()"
        someAction(h);  // Treat it as an ActionCharacter   - "ActionCharacter::fight()"
    }

}
