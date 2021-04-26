package horrorshow;

// The following syntax only works when inheriting interfaces 
//   - it will not work with normal classes. 
public interface Vampire extends DangerousMonster, Lethal {

    public void drinkBlood();
}
