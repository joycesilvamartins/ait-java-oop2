package arrays;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Scanner;

class Personn {

    private String name;
    private int age;

    Personn(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person { " + " name= " + name + " , age= " + age + " }";

    }

}

public class ArraysListPeople {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Personn> people = new ArrayList<>();// java 1.7 - (ArrayList = storage for people)
        final int ADD = 1, UPDATE = 2, DELETE_ONE = 3, DELETE_ALL = 4,
                FIND_PERSON_BY_INDEX = 5, DISPLAY = 6, EXIT = 7;

        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")) {
            int choice = userChoice();
            switch (choice) {
                case ADD:
                    add(people);
                    break;
                case UPDATE:
                    update(people);
                    break;
                case DELETE_ONE:
                    deletePerson(people);
                    break;
                case FIND_PERSON_BY_INDEX:
                    findPersonByIndex(people);
                    break;
                case DISPLAY:
                    display(people);
                    break;
                case EXIT:
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown value");
                    break;
            }
        }
    }

    public static int userChoice() {

        System.out.println("People register: ");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete a person");
        System.out.println("4. Delete everyone");
        System.out.println("5. Find a person");
        System.out.println("6. Display");
        System.out.println("7. Exit");
        System.out.println("Enter choice -->");
        return sc.nextInt();
    }

    public static void add(ArrayList<Personn> people) {
        System.out.println("Enter a name: ");
        String name = sc.next();

        // check that the name is not in the AL i.e. do NOT
        // add it a second time
        if (personThereAlready(name, people) >= 0) {
            System.out.println(name + " already in the list");
        } else {
            // name was not found in list, get the remaining
            // properties and add the new Personn
            System.out.println("Enter age: ");
            int age = sc.nextInt();

            Personn person = new Personn(name, age);
            people.add(person);
        }
    }

    public static int personThereAlready(String name, ArrayList<Personn> people) {

        // for(int i=0;i < people.size(); i++){//percorrendo o array
        // }        
        for (Personn person : people) {//enhanced for
            if (person.getName().equalsIgnoreCase(name)) {
                return people.indexOf(person);
            }
        }
        return -1;
    }

    public static void update(ArrayList<Personn> people) {
        System.out.println("Enter a name -->");
        String name = sc.next();
        //check that the name is IN the AL i.e. only update
        //it if it exists
        int index = personThereAlready(name, people);
        if (index == -1) {//not found
            System.out.println(name + "not in list");
        } else {
            //retrieve the Personn at that index
            Personn person = people.get(index);

            System.out.println("Enter the new name -->");
            person.setName(sc.next());
            System.out.println("Enter the new age -->");
            int age = sc.nextInt();
            person.setAge(age);

            // update the object (ref) at the 'index'
            //people.set(index, p);
            System.out.println(people);
        }
    }

    public static void deletePerson(ArrayList<Personn> people) {
        System.out.println(people);

        System.out.println("Enter a name -->");
        String name = sc.next();

        //check that the name is IN the AL
        int index = personThereAlready(name, people);
        if (index == -1) {//not found
            System.out.println(name + "not in list");
        } else {
            people.remove(index);
            System.out.println(people);
        }
    }

    public static void deleteEveryone(ArrayList<Personn> people) {
        people.clear();

        if (people.isEmpty()) {
            System.out.println("List is empty!");
        }
    }

    public static void findPersonByIndex(ArrayList<Personn> people) {
        System.out.println("Enter an index -->");
        int index = sc.nextInt();

        if (index < 0 || index >= people.size()) {
            System.out.println("Invalid index: " + index);
        } else {
            //index is ok
            Personn p = people.get(index);
            System.out.println(p);
        }
    }

    public static void findPersonByName(ArrayList<Personn> people) {
        System.out.println("Enter a name -->");
        String name = sc.next();

        for (Personn person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                System.out.println("Found person");
                return;
            }
        }
        System.out.println("Did not find person");
    }

    public static void display(ArrayList<Personn> people) {
        System.out.println(people);
    }
}
