package horrorshow;

public class Dracula implements Vampire {
    // all methods in interfaces are public by default (even if you dont specify
    // an accessor modifier); thus I must put public on all the methods here,
    // otherwise they default to package-private and the access is weaker resulting
    // in a compiler error
    //   => no access specified in an interface - default access is public
    //   => no access specified in a class      - default access is package-private

    @Override
    public void drinkBlood() {                  // Vampire interface
        System.out.println("Dracula::drinkBlood");
    }

    @Override
    public void destroy() {                     // Lethal interface
        System.out.println("Dracula::destroy");
    }

    @Override
    public void menace() {                      // DangerousMonster interface
        System.out.println("Dracula::menace");
    }

    @Override
    public void kill() {                    // Monster interface
        System.out.println("Dracula::kill");
    }

}
