package horrorshow;

public class DragonZilla implements DangerousMonster {

    @Override
    public void destroy() {
        System.out.println("Dragonzilla::destroy");
    }

    @Override
    public void menace() {
        System.out.println("Dragonzilla::menace");
    }

}
