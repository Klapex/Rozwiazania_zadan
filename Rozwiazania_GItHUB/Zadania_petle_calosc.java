package pl.samouczek.zbior_zadan;


import java.util.Scanner;

public class Zadania_petle_calosc {

    public static void main(String[] args) {

         /*
             1.Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli
             na ekranie liczby od zera do X,
        */

        loopFor(4);

        /*
            2. Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
         */
        loopWhile(4);

        /*
           3. Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X większą od zera.
            Klasa powinna mieć 2 metody:
             - int[] oneDimension - zwróci instancję tablicy jednowymiarowej o długości X,
            - int[][] twoDimension - zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy
             i liczba kolumn równa się X,
        */

        int array_size = 5;

        ArrayFactory arrays = new ArrayFactory(array_size);

        int[] onesize = arrays.oneDimension();
        int[][] doublesize = arrays.twoDimension();

        /*
            4.  Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej
            linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
         */
        reverseDigits(123657);

        /*
           5.Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
            Na przykład “pies” przekształci w “seip”,
        */

        System.out.println(reverseWord("pieseczek"));

        /*
            6.Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej
            (2 => “10”, 4 => “100”, 5 => “101”, itd.).
        */

        int numberToBeConverted = 12345;

        int[] binaryArray = binaryCalc(numberToBeConverted);
        binaryPrintout(numberToBeConverted, binaryArray);

        /*
            7. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
             Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.
              Może przydać Ci się metoda String#toCharArray
        */
        String word = "kajak", reversedWord = "";
        boolean isPalindrom;

        reversedWord = reverseWord(word);
        isPalindrom = isPalindrom(word, reversedWord);

        System.out.println("Is word '" + word + "' a palindrom?" + isPalindrom);

        /*
            8. Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”)
        */

        //pobiera parametr 'doublesize' z zadania nr3
        arrays.unitMatrix(doublesize);
        matrixPrintout(doublesize);

        /*
            9.Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci
            “[liczba, liczba, liczba]”,
        */

        int[][] arrayNumbers = new int[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        matrixPrintout(arrayNumbers);


         /*
            10.	Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do
            największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.

        */

        int[] unsortedArray2 = {1112, 102, 92, 82, 12, 72};


        int[] sortedArray2 = bubbleSort(unsortedArray2);
        sortedArrayPrintout(sortedArray2);


        /*
            10.	Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do
            największej liczby.

            **** INNY ALGORYTM SORTOWANIA ****
        */

        int maxValue = -1, sorted = 1;
        int position = -1;


        int[] unsortedArray = {1111, 100, 90, 80, 11, 70};

        int[] sortedArray = anotherSortingAlgorithm(unsortedArray, maxValue, sorted, position);

        sortedArrayPrintout(sortedArray);


    } // Koniec metody main


    public static void loopFor(int number) {
        System.out.println("wersja z petla 'for'");
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

    }

    public static void loopWhile(int number) {
        System.out.println("Wersja z petla 'while'");
        int a = 0;
        while (a <= number) {
            System.out.println(a);
            a++;
        }
    }

    public static void reverseDigits(int digits) {
        int reszta;
        while (digits > 0) {
            reszta = digits % 10;
            digits /= 10;
            System.out.println(reszta);

        }
    }

    public static String reverseWord(String word) {

        int str_count = word.length();
        char[] array = new char[str_count];

        for (int i = 0; i < str_count; i++) {
            array[i] = word.charAt(i);
        }
        word = "";
        for (int i = str_count - 1; i >= 0; i--) {
            word += array[i];
        }
        return word;
    }

    static int[] binaryCalc(int numberToBeConverted) {
        //Obliczenia miejsc szyku dla liczby binarnej
        final double LOGN2 = Math.log(2);
        double lognx = Math.log(numberToBeConverted);
        double power = lognx / LOGN2;
        int integer_power = (int) power + 1;
        int[] binaryArray = new int[integer_power];
        int additional_parameter;

        //konwersja do liczby binarnej
        while (numberToBeConverted > 0) {
            additional_parameter = numberToBeConverted % 2;
            numberToBeConverted /= 2;
            binaryArray[integer_power - 1] = additional_parameter;
            integer_power--;
        }
        return binaryArray;
    }

    static void binaryPrintout(int number, int binaryArray[]) {
        System.out.println("Postac binarna liczby " + number + " to:");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i]);
        }
        System.out.println("");
    }


    static boolean isPalindrom(String word, String reverseword) {
        return word.equals(reverseword);
    }

    public static void matrixPrintout(int array[][]) {
        System.out.println("macierz o wymiarach:" + array.length + "x" + array.length);
        for (int a = 0; a < array.length; a++) {
            System.out.print("[");
            for (int b = 0; b < array.length; b++) {
                System.out.print(array[a][b]);
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    static int[] anotherSortingAlgorithm(int array[], int maxValue, int sorted, int position) {
        for (int i = 0; i <= (array.length - sorted); i++) {
            if (maxValue <= array[i]) {
                maxValue = array[i];
                position = i;
            }


            if (i == (array.length - sorted)) {
                //wrzucenie na ostatnia pozycje w arrayu
                //zamiana miejsc w szyku

                array[position] = array[array.length - sorted];
                array[array.length - sorted] = maxValue;
                sorted += 1;
                i = 0; //zeby zaczynal przeszukiwac od poczatku
                maxValue = -1;

            }
        }
        //musi byc ten ostatni warunek inaczej nie sprawdzi ostatniej pary
        if (array[0] > array[1]) {
            maxValue = array[0];
            array[0] = array[1];
            array[1] = maxValue;
        }


        return array;
    }

    public static int[] bubbleSort(int[] unsortedArray2) {

        int temp_par = -1;

        for (int i = 0; i < (unsortedArray2.length - 1); i++) {

            if (unsortedArray2[i] > unsortedArray2[i + 1]) {
                temp_par = unsortedArray2[i];
                unsortedArray2[i] = unsortedArray2[i + 1];
                unsortedArray2[i + 1] = temp_par;
                i = -1;

            }
        }
        return unsortedArray2;
    }


    static void sortedArrayPrintout(int sorted[]) {
        for (int a = 0; a < sorted.length; a++) {
            System.out.println("[" + a + "]=" + sorted[a]);

        }
        System.out.println("");
    }

}






