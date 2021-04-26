package horrorshow;

// Extending an interface with inheritance.
public class HorrorShow {

    public static void isDangerousMonster(DangerousMonster dm) {
        dm.destroy();
        dm.menace();

    }

    public static void isMonster(Monster m) {
        m.menace();
    }

    public static void isVampire(Vampire v) {
        v.menace();         // Monster interface
        v.destroy();        // DangerousMonster interface
        v.kill();           // Lethal interface
        v.drinkBlood();     // Vampire interface
    }

    public static void isLethal(Lethal l) {
        l.kill(); //Lethal interface

    }

    public static void main(String[] args) {
        // DragonZilla refs can be treated as DragonZilla refs (obviously) but also the refs can be 
        // upcast to (and therefore treated as) DangerousMonster and Monster references.

//        DragonZilla dz = new DragonZilla();
//        isMonster(dz);
//        isDangerousMonster(dz);
        // The remainder is creating a Dracula object and passing it into various methods;
        // these methods upcast the Dracula reference to all the interfaces that the 
        // Dracula class implements (either directly or indirectly)...
        Dracula dr = new Dracula();
        isMonster(dr);
        isDangerousMonster(dr);
        isVampire(dr);
        isLethal(dr);

    }

}
