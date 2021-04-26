//class  Instrument  {
//
//    public void play() {
//
//        System.out.println("Instrument::play()");
//
//    }
//
//    public String what() {
//        return "Instrument::what()";
//
//    }
//
//    public void adjust() {
//
//        System.out.println("Instrument::adjust()");
//
//    }
//
//}
//abstract class Instrument {
//
//    public abstract void play();
//
//    public abstract void adjust();
//}

public interface Instrument {
    
    int i=5;

    void play();

    String what();

    void adjust();

}
