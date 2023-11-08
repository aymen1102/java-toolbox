package algorithmics.codingame.model;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Actor {

    String name;
    LocalDate birthday;

    public Actor(String name, LocalDate birthday) {
        super();
        this.name = name;
        this.birthday = birthday;
    }

    public static List<Actor> createcast() {
        List<Actor> cast = new ArrayList<>();
        cast.add(new Actor("Fred", IsoChronology.INSTANCE.date(1980, 6, 20)));
        cast.add(new Actor("Omar", IsoChronology.INSTANCE.date(1990, 12, 10)));
        cast.add(new Actor("Halim", IsoChronology.INSTANCE.date(2005, 2, 11)));
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public void printActor() {
        System.out.println(this.getName() + ", " + this.getAge());
    }
}