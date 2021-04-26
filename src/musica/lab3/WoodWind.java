package musica.lab3;

import music.lab1.*;

class WoodWind extends Wind {

    @Override
    public void play() {

        System.out.println("WoodWind::play()");

    }

    @Override
    public String what() {

        return "WoodWind::what()";
    }

}
