// Name:Joyce Martins
package hdip.oop2.code2;

public class Car implements Driveable {

    private String theRegNo;

    public Car(String aRegNo) {
        theRegNo = aRegNo;
    }

    @Override
    public String getRegNo() {
        return theRegNo;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Car) {

            Car otherCar = (Car) obj;

            if (this.getRegNo().equals(otherCar.getRegNo())) {
                return true;
            }
        }
        return false;
    }
}
