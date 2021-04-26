package com.mase.inheritance;

class Art {

    Art() {
        System.out.println("Art constructor");
    }

    public void methodX() {
        System.out.println("Art: :methodX");
    }

    @Override
    public String toString() {
        return "Art: : toString()";
    }
}

class Drawing extends Art {

    Drawing() {
        System.out.println("Drawing constructor");
    }

    public void methodX() {
        System.out.println("Drawing: :methodX");
    }

    @Override
    public String toString() {
        return "Drawing: :toString()";
    }
}

class Cartoon extends Drawing {

    Cartoon() {
        System.out.println("Cartoon constructor");
    }

    @Override
    public void methodX() {
        System.out.println("Cartoon: :methodX");
    }

    public void y() {
        System.out.println("Cartoon: :y");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();

        methodY(new Cartoon());
        upcasting();
        downcasting();
    }

    public static void methodY(Art a) {
        a.methodX();
    //    a.y();// error - Art has no 'Y()'
    }

    public static void upcasting() {

        Art a1 = new Art();
        System.out.println(a1);

        Art a2 = new Drawing();
        System.out.println(a2);

        Art a3 = new Cartoon();
        System.out.println(a3);

        Drawing d1 = new Drawing();
        System.out.println(d1);

        Drawing d2 = new Cartoon();
        System.out.println(d2);
        
        Cartoon c1 = new Cartoon();
        System.out.println(c1);        
    }
    
    public static void downcasting(){
        
        Art a1 = new Drawing();
        
        
        
        
    }

}
