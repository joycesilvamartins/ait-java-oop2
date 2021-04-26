package musica.lab3;

import music.lab1.*;

class Stringed implements Instrument {

    @Override
    public void play() {

        System.out.println("Stringed::play()");

    }

    @Override
    public String what() {

        return "Stringed::what()";
    }

    @Override
    public void adjust() {

        System.out.println("Stringed::adjust()");
    }

}
