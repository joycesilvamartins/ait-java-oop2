package hdip.oop2.inheritance;

public class PIE {

    public static void main(String[] args) {
//        //1.
        Human h = new Human();
//        System.out.println(h.toString());//Human
//        System.out.println(h);//Human::toString
//        //2.
//      h = new Male();
//        //3.
//    System.out.println(h);//Male::toString
//        //4.
//       h = new Female();
//        //5.
//        System.out.println(h);//Female::toString
//        //6.
//       h = new Boy();
//        //7.
//      System.out.println(h);//Male::toString
//        //8.
//        Male m = (Male) new Human();//override it
//        System.out.println(m.show());
//        //9.
//        Boy b = new Boy();
//        System.out.println(b.show());
        //10.
        doSomething(new Human());
        doSomething(new Male());
        doSomething(new Female());
        doSomething(new Boy());
        doSomething(new Girl());
        doSomething(new Man());
        doSomething(new Woman());
    }

    public static void doSomething(Human h) {
        System.out.println(h.whoAmI());
    }
}

class Human {

    @Override
    public String toString() {
        return "Human::toString";
    }

    public String whoAmI() {
        return "Human::whoAmI";
    }
}

class Male extends Human {

    @Override
    public String toString() {
        return "Male::toString";
    }

    @Override
    public String whoAmI() {
        return "Male::whoAmI";
    }

    public String show() {
        return "I am a man";
    }
}

class Boy extends Male {

//    @Override
//    public String toString() {
//        return "Boy::toString";
//    }
}

class Man extends Male {

    @Override
    public String toString() {
        return "Man::toString";
    }
}

class Female extends Human {

    @Override
    public String toString() {
        return "Female::toString";
    }

    @Override
    public String whoAmI() {
        return "Female::whoAmI";
    }
}

class Girl extends Female {

    @Override
    public String toString() {
        return "Girl::toString";
    }
}

class Woman extends Female {

    @Override
    public String toString() {
        return "Woman::toString";
    }
}
