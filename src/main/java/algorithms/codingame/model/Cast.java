package algorithms.codingame.model;

import java.util.List;
import java.util.stream.Collectors;

public class Cast {

    interface CheckPerson {
        boolean test(Actor p);
    }

    public static void printActors(List<Actor> cast) {
        for (Actor p : cast) {
            p.printActor();
        }
    }

    public static List<Actor> getActorsOlderThan(List<Actor> cast, int ageLimit) {
        List<Actor> result = cast.stream().filter(p -> p.getAge() > ageLimit).collect(Collectors.toList());
        return result;
    }
}