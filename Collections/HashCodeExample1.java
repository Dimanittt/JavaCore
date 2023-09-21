package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Pupil, Double> map = new HashMap<>();
        Pupil pupil1 = new Pupil("Dmitry", "Starostin", 3);
        Pupil pupil2 = new Pupil("Olesya", "Afanasyeva", 1);
        Pupil pupil3 = new Pupil("Alexander", "Butorin", 3);
        map.put(pupil1, 9.2);
        map.put(pupil2, 8.6);
        map.put(pupil3, 7.5);
        System.out.println("map:" + map);

        Pupil pupil4 = new Pupil("Dmitry", "Starostin", 3);
        System.out.println("map.containsKey(pupil4): " + map.containsKey(pupil4));
        System.out.println("pupil1.equals(pupil4): " + pupil1.equals(pupil4));
        System.out.println("pupil1.hashCode() + pupil4.hashCode() = " + pupil1.hashCode() + " + " + pupil4.hashCode());
        System.out.println();
        System.out.println("Map.Entry... getting of key and values of map:");
        for (Map.Entry<Pupil, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
        ArrayList<Pupil> arrayList = new ArrayList<>(map.keySet());
        System.out.println("arrayList from map.keySey(): " + arrayList);
        ArrayList<Double> arrayList1 = new ArrayList<>(map.values());
        System.out.println("arrayList from map.values(): " + arrayList1);
        System.out.println();
        System.out.println("map.containsKey(pupil1): " + map.containsKey(pupil1));
        pupil1.course = 4;
        System.out.println("map.containsKey(pupil1) after pupil1.course = 4: " + map.containsKey(pupil1));
        System.out.println("In order to avoid this situatuion key must be IMMUTABLE");
    }
}

class Pupil {
    String name;
    String surname;
    int course;

    public Pupil(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupil pupil = (Pupil) o;
        return course == pupil.course && Objects.equals(name, pupil.name) && Objects.equals(surname, pupil.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}