package musica.lab3;

import music.lab1.*;

class Brass extends Wind {

    @Override
    public void play() {

        System.out.println("Brass::play()");

    }

    @Override
    public String what() {

        return "Brass::what()";
    }

    @Override
    public void adjust() {

        System.out.println("Brass::adjust()");
    }

}
