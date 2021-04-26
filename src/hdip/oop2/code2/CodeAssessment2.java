// Name:Joyce Martins
package hdip.oop2.code2;

import java.util.Scanner;

public class CodeAssessment2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int ENUMS = 1, CARS = 2, EXCEPTIONS = 3, EXIT = 99;
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")) {
            switch (userChoice()) {
                case ENUMS:
                    enums();
                    break;
                case CARS:
                    cars();
                    break;
                case EXCEPTIONS:
                    a();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown entry : ");
                    break;
            }
        }
    }

    public static void a() {

        try {
            b();
        } catch (Exception e) {
            System.out.println("Exception handled in a().");
        }
    }

    public static void b() throws Exception {
        c();
    }

    public static void c() throws Exception {
        throw new Exception();
    }

    public static void cars() {

        Car car1 = new Car("12G123");
        Car car2 = new Car("12D987");
        Car car3 = new Car("12G123");

        System.out.println("Comparing car1 and car2: " + car1.equals(car2));
        System.out.println("Comparing car2 and car3: " + car2.equals(car3));
        System.out.println("Comparing car1 and car3: " + car1.equals(car3));

    }

    public static void enums() {

        FarmerType john = FarmerType.BEEF;
        john.setNumAcres(500);
        System.out.println("John is a: " + john.toString());
        System.out.println("John's grant is: " + calculateGrant(john));
    }

    public static double calculateGrant(FarmerType farmer) {

        double grant = 0.0;

        if (farmer == FarmerType.BEEF) {
            if (farmer.getNumAcres() < 200) {
                grant = (200.0 * farmer.getNumAcres());
            } else {
                grant = (50.0 * farmer.getNumAcres());
            }
        }
        if (farmer == FarmerType.DAIRY) {
            if (farmer.getNumAcres() < 200) {
                grant = (300.0 * farmer.getNumAcres());
            } else {
                grant = (80.0 * farmer.getNumAcres());
            }
        }
        if (farmer == FarmerType.SHEEP) {
            if (farmer.getNumAcres() < 200) {
                grant = (150.0 * farmer.getNumAcres());
            } else {
                grant = (40.0 * farmer.getNumAcres());
            }
        }
        return grant;
    }

    public static int userChoice() {
        System.out.println("What do you want to do ?");
        System.out.println("1. Enumerations");
        System.out.println("2. Cars");
        System.out.println("3. Exceptions");
        System.out.println("99. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}
