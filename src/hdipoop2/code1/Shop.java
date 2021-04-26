package hdipoop2.code1;

/* @author joyce*/
import java.util.List;
import hdipoop2.ElectronicDevice;
import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
        //declare an array list
        List<ElectronicDevice> devices = new ArrayList<>();
        //declare and initialise
        ElectronicDevice plasma = new Plasma("Sony", "P300");
        ElectronicDevice laptop = new Laptop("Dell", "Inspiron");
        //add to the array
        devices.add(plasma);
        devices.add(laptop);
        //invoke the process
        processDevices(devices);
    }

    public static void processDevices(List<ElectronicDevice> devices) {

        for (ElectronicDevice dv : devices) {
            System.out.print(dv);

            if (dv instanceof HighlyDesirable) {
                System.out.println(" - Highly Desirable");
            }
            System.out.println(" ");
        }
    }
}
