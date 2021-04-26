package musica.lab3;

import music.lab1.*;

class Wind implements Instrument {

    @Override
    public void play() {

        System.out.println("Wind::play()");

    }

    @Override
    public String what() {

        return "Wind::what()";
    }

    @Override
    public void adjust() {

        System.out.println("Wind::adjust()");
    }

}
