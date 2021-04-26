package equality;

public class Person {

    private String ppsNo, name;
    private int age;

    public Person(String ppsNo, String name, int age) {
        this.ppsNo = ppsNo;
        this.name = name;
        this.age = age;
    }
    // one Person is considered equal to another Person
    // if their PPS numbers are equal

    public String getPpsNo() {
        return ppsNo;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + ppsNo;
    }

    @Override
    public boolean equals(Object o) {
        // p1.equals(p2)
        // this == p1 and obj = p2
        if (o instanceof Person) {

            Person otherPerson = (Person) o;
            // "524H59".equals("675T64");
            if (getPpsNo().equals(otherPerson.getPpsNo())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Person p1 = new Person("524H59", "Joe Bloggs", 23);
        Person p2 = new Person("524H59", "Joe Bloggs", 23);
        Person p3 = new Person("675T64", "Joseph P. Bloggs", 23);

        if (p1.equals(p2)) {
            System.out.println("1.p1==p2");
            System.out.println(p1);
            System.out.println(p2);
        }
        if (p1.equals(p3)) {
            System.out.println("2.p1==p3");
            System.out.println(p1);
            System.out.println(p3);
        }
        if (p2.equals(p3)) {
            System.out.println("3.p2==p3");
            System.out.println(p2);
            System.out.println(p3);
        }
    }

}
