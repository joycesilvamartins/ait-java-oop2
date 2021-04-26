package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListExample {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> destinations = new ArrayList<>();
        final int ADD = 1, UPDATE = 2, DELETE = 3, DISPLAY = 4, EXIT = 5;
        String userContinue = "y";

        while (userContinue.equals("y")) {// True first time
            int choice = userChoice();
            switch (choice) {
                case ADD:
                    String dest = add();
                    destinations.add(dest);
                    break;
                case UPDATE:
                    update(destinations);
                    break;
                case DELETE:
                    delete(destinations);
                    break;
                case DISPLAY:
                    display(destinations);
                    break;
                case EXIT:
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknow value");
                    break;
            }
        }
    }

    public static int userChoice() {
        System.out.println("Holidays destinations program. ");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static String add() {
        System.out.println("Enter destination to add: ");
        return sc.next();
    }

    public static void update(ArrayList<String> destAL) {
        System.out.println("The destination before: " + destAL);

        System.out.println("Enter index to update: ");
        int index = sc.nextInt();

        System.out.println("Enter the new destination: ");
        String newDest = sc.next();
        destAL.set(index, newDest);
    }

    public static void delete(ArrayList<String> destAL) {
        System.out.println("The destinations before: " + destAL);

        for (String dest : destAL) {
            System.out.println(dest);
        }
    }

    public static void display(ArrayList<String> destAL) {
        System.out.println("The destinations are: ");

        for (String dest : destAL) {
            System.out.println(dest);
        }
    }
}
