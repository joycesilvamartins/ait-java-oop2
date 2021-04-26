package music.lab2;

import music.lab1.*;

abstract class Instrument {

    public abstract void play(); 


    public String what() {

        return "Instrument::what()";
    }

    public abstract void adjust();
}
