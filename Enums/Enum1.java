package Enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();
        WeekDays weekDays = WeekDays.SUNDAY;
        System.out.println();

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNSDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY, //this enum's part does't have any args because of no arg constructor
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) { //constructor
        this.mood = mood;
    }

    WeekDays() {
    }

    public String getMood() {
        return mood;
    }

}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNSDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to Work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can sit back and relax :)");
                break;
        }
        System.out.println("Mood int this week day: " + weekDay.getMood());
    }
}