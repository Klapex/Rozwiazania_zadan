package pl.samouczek.zbior_zadan;

public class Zadanie_tablice {

         /*
         1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
         */

    public static void main(String[] args) {

        String[] str = stringArray();

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        /*
       2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te
       same elementy w odwróconej kolejności.
         */

        int[] array = {2, 3, 4};
        int[] reverseArray = reverseArray(array);
        System.out.println("Elementy reverseArray[]:");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println("Element [" + i + "]=" + reverseArray[i]);
        }

    }

    static String[] stringArray() {
        String[] anotherTable = {"a", "b", "c", "d", "e"};
        return anotherTable;
    }

    static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[(array.length - 1) - i];
        }
        return reverseArray;

    }


}