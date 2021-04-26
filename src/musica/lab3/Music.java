package musica.lab3;

import music.lab1.*;

public class Music {

    public static void tune(Instrument i) {
        //*using the Instrument reference, invoke play() on the object passed in*
        i.play();
    }

    public static void tuneAll(Instrument[] ia) {
        //*using traditional for loop, iterate through the array passed in,invoke tune()on each object*  
//        for (int i = 0; i < ia.length; i++) {
//            tune(ia[i]);//*invoke tune*
//        }
        //*use enhanced-for loop to process the loop
        for (Instrument instrument : ia) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        //*create an array of 5 elements*
        int i = 0;
        Instrument[] orchestra = new Instrument[5];
        //*instead of inserting 5 Instruments objects, insert the objects wind,stringed,percussion,woodwind and brass into successive location*
        orchestra[i++] = new Stringed();
        orchestra[i++] = new Wind();
        orchestra[i++] = new Percussion();
        orchestra[i++] = new WoodWind();
        orchestra[i++] = new Brass();

        //*Insert instrument object into each location of array* 
        //Is this possible?Why or Why not? not is possible, instrument is abstrat, cannot instantiated!*   
//        orchestra[i++] = new Instrument();
//        orchestra[i++] = new Instrument();
//        orchestra[i++] = new Instrument();
//        orchestra[i++] = new Instrument();
//        orchestra[i++] = new Instrument();
        //*invoke tuneAll() passing in the orchestra array*
        tuneAll(orchestra);

    }
}
