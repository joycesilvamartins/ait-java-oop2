package music.lab1;

class Percussion extends Instrument {

    @Override
    public void play() {

        System.out.println("Percussion::play()");

    }

    @Override
    public String what() {

        return "Percussion::what()";
    }

    @Override
    public void adjust() {

        System.out.println("Percussion::adjust()");
    }

}
