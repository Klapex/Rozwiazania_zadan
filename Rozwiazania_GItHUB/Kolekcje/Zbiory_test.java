package Kolekcje;

import java.util.Set;
import java.util.HashSet;

public class Zbiory_test {

    public static void main(String[] args) {

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Zenon");
        otherSet.add("Marek");

        setWithNames.addAll(otherSet);

        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Marcin"));
        System.out.println(setWithNames.remove("Janusz"));
        System.out.println("other set size:"+otherSet.size());
        otherSet.add("Zenon");
        System.out.println("other set size:"+otherSet.size());
    }

}
