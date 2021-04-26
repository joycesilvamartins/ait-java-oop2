package com.example.enums.simple;

public class EnumTest {

    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikes() {

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are ok");
                break;
        }

    }

    public static void main(String[] args) {

        EnumTest et = new EnumTest(Day.MONDAY);
        et.tellItLikes();
        et = new EnumTest(Day.WEDNESDAY);
        et.tellItLikes();
        et = new EnumTest(Day.FRIDAY);
        et.tellItLikes();
        et = new EnumTest(Day.SATURDAY);
        et.tellItLikes();
        et = new EnumTest(Day.SUNDAY);
        et.tellItLikes();

    }

}
