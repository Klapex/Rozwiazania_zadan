package pl.samouczek.zbior_zadan;


import java.util.Scanner;
import pl.samouczek.zbior_zadan.Zadania_petle_calosc;

public class Zadania_Typ_Prosty {

    public static void main(String[] args) {

        /*
            1.	Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga,
                wzrost, imię i płeć. Klasa powinna także
                zawierać metody getAge, getWeight, getHeight, getName, isMale.

             Jeśli w klasie Human użyłeś typów prostych zamień je na odpowiadające im klasy (int => Integer),

         */

        Human_TypProsty male = new Human_TypProsty(38,92.4,191,"male","Raf");

        System.out.println("Twoje dane personalne to:");
        System.out.println("imie:"+male.getName());
        System.out.println("wiek:"+male.getAge());
        System.out.println("waga:"+male.getWeight());
        System.out.println("wzrost:"+male.getHeight());
        System.out.println("mezczyzna?"+male.isMale());

        Scanner input = new Scanner (System.in);
        System.out.println("Zadanie 2. Konwersja liczby dziesietnej to posatci binarnej");
        System.out.println("Podaj liczbe:");
        System.out.println("?");
        int numberToBeConverted=input.nextInt();

        Zadania_petle_calosc importKlasy = new Zadania_petle_calosc();

        int[] binaryArray = importKlasy.binaryCalc(numberToBeConverted);
        importKlasy.binaryPrintout(numberToBeConverted, binaryArray);

    /*
        3. Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy,
        a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli
        tablicę posortowaną w kolejności od najmniejszej do największej liczby,
    */

        System.out.println("Zadanie 3. Sortowanie elementow tablicy");
        System.out.println("Podaj dlugosc tablicy");
        System.out.println("?");
        int size = input.nextInt();


        int[] unsortedArray = new int[size];

        for (int i = 0; i <=unsortedArray.length-1 ; i++) {
            System.out.println("podaj liczbe dla pozycji ["+i+"] tablicy.");
            System.out.println("?");
            unsortedArray[i]=input.nextInt();
        }

        int[]sortedArray = importKlasy.bubbleSort(unsortedArray);
        importKlasy.sortedArrayPrintout(sortedArray);


    /*
       4.Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość,
        informację czy jest to palindrom czy nie oraz jego odwróconą wartość.
    */

        System.out.println("Zadanie 4. Informacje o lancuchu znakow.");
        System.out.println("Podaj slowo / lancuch znakow.");
        System.out.println("?");
        String word = input.next();

        String reversedWord = importKlasy.reverseWord(word);
        boolean isPalindrom = importKlasy.isPalindrom(word, reversedWord);

        System.out.println("word '"+word+"' reversed ="+importKlasy.reverseWord(word));
        System.out.println("Is word '" + word + "' a palindrom?" + isPalindrom);
        System.out.println("String '"+word+"' length is "+word.length());
    }

}
