package shadowing;

class A {

    public int i = 10;
    private int j = 20;
    int m = 1;

    public void im() {
        System.out.println("A::im()");
    }

    public static void sm() {
        System.out.println("A::sm()");
    }
}

class B extends A {

    private int i = 30;
    public int k = 40;
    int m = 2;

    public void im() {
        System.out.println("B::im()");
    }

    public static void sm() {
        System.out.println("B::sm()");
    }
}

class C extends B {

    int m = 3;

    public void im() {
        System.out.println("C::im()");
    }

    public static void sm() {
        System.out.println("C::sm()");
    }
}

public class TestClass {

    public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.i);
        //System.out.println(c.j);
        System.out.println(c.k);//output 40

        System.out.println(((A) c).i);//output 10 - cast
        System.out.println(c.m);//output 3
        //System.out.println((B) c.m);
        System.out.println(((B) c).m);//output 2
        System.out.println(((A) c).m);//output 1

        A a = new C();
        a.im();//output C::im()

        a = new B();
        a.im();//output B::im()

        a = new A();
        a.im();//output A::im()

        a = new C();
        ((A) a).im();//output C::im()

        A aref = new C();
        System.out.println(aref.m);//output 1
        aref.im();//output C::im()
        aref.sm();//output A::sm()
    }
}
