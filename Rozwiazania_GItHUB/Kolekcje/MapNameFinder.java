package Kolekcje;

/*
Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”, następnie poprosi
 użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class MapNameFinder {

    public static void main(String[] args) {

        Map<String, String> names1 = new HashMap<>();
        Map<String, String> names2 = new HashMap<>();
        Scanner input = new Scanner(System.in);

        int counter = 1;
        String name1 = "", name2 = "";

        System.out.println("Baza danych przechowujaca imiona par.");
        System.out.println("Podaj imie 1 i 2 lub '-' + <Enter> aby zakonczyc.");

        while (true) {
            System.out.println("Podaj imie 1 dla pary nr" + counter);
            name1 = input.nextLine();
            if (checkIfEndOfDataEntry(name1)) {
                break;
            }

            System.out.println("podaj imie 2 dla pary nr" + counter);
            name2 = input.nextLine();
            if (checkIfEndOfDataEntry(name2)) {
                break;
            }
            names1.put(name1, name2);
            names2.put(name2, name1);
            counter++;
        }

        System.out.println("Podaj imie do wyszukania: ");
        String nameFind = input.nextLine();

        keyFinder(nameFind, names1, names2);

        System.out.println("Lista imion w liscie");
        for(String key : names1.keySet()) {

            System.out.println(key + " + " + names1.get(key));
        }
        System.out.println("Koniec programu.");

    }

    static boolean checkIfEndOfDataEntry(String name) {
        if (name.equals("-")) {
            System.out.println("Koniec wprowadzania danych");
            return true;
        }
        return false;
    }

    public static void keyFinder(String nameFind, Map<String, String> names1, Map<String, String> names2) {

        String searchResult = names1.get(nameFind);
        if (searchResult == null) {
            searchResult = names2.get(nameFind);
            if (searchResult == null) {
                System.out.println("Takiej pary nie ma na liscie.");
                return;
            } else {
                pairsPrintout(nameFind, searchResult);
            }
        } else {
            pairsPrintout(nameFind, searchResult);
        }
    }

    public static void pairsPrintout(String namefind, String searchResult) {
        System.out.println("Para ktora znalazlem to:" + namefind + " i " + searchResult);
    }

}
