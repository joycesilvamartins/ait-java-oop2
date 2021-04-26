package taginterface;

import java.util.ArrayList;
import java.util.List;

public class TagTest {

    public static void main(String[] args) {
        //1. i,ii,iii
        Cow c = new Cow();
        Sheep s = new Sheep();
        Dog d = new Dog();
        //Extra Ex.
        Cat kit = new Cat();
        Horse blackBeauty = new Horse();

        //iv
        // the vet has to check animals that are tagged
        // if the cow ref is referring to an object that 
        // implements Tag...
        if (c instanceof Tag) {//True
            System.out.println("Check this animal - Cow");
        }
        if (s instanceof Tag) {//True
            System.out.println("Check this animal - Sheep");
        }
        if (d instanceof Tag) {//False
            System.out.println("Check this animal - Dog");
        }

        //2. i,ii,iii
        Animal daisy = new Cow();
        Animal cybil = new Sheep();
        Animal tyson = new Dog();

        //3.a,b,i,ii,iii,iv,v,vi
        checkOne(c);      //cow
        checkOne(s);      //sheep
        checkOne(d);
        checkOne(daisy);   //cow
        checkOne(cybil);   //sheep
        checkOne(tyson);

        //4.a
        List<Animal> animals = new ArrayList<>();
        //b
        animals.add(c);
        animals.add(s);
        animals.add(d);
        //c
        checkAll(animals);

    }

    public static void checkOne(Animal animal) {
        //3.c
        if (animal instanceof Tag) {
            System.out.println("Check one - "
                    + animal.getClass().getSimpleName());
        }

    }

    public static void checkAll(List<Animal> animals) {
        //4.d
        //type - ref  - ArrayList
        for (Animal animal : animals) {
            if (animal instanceof Tag) {
                System.out.println("Check all - "
                        + animal.getClass().getSimpleName());
            }

        }

    }

}
