package pl.samouczek.zbior_zadan;

public class Zadanie_obiekty {
    public static void main(String[] args) {
        /* 1.	Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga,
         wzrost, imię i płeć. Klasa powinna także
        zawierać metody getAge, getWeight, getHeight, getName, isMale.

         */

        Human male = new Human(38, 93, 191, "male", "Raf");

        System.out.println("Twoje dane personalne to:");
        System.out.println("imie:" + male.getName());
        System.out.println("wiek:" + male.getAge());
        System.out.println("waga:" + male.getWeight());
        System.out.println("wzrost:" + male.getHeight());
        System.out.println("mezczyzna?" + male.isMale());

        /* zadanie 2:2.	Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
         Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.*/
        int bok1 = 2, bok2 = 3;
        Rect rect = new Rect(bok1, bok2);
        System.out.println("Dane prostokata, bok1:" + bok1 + ",bok2:" + bok2);
        System.out.println("Pole:" + rect.getArea() + ",obwod:" + rect.getCircum());
        System.out.printf("przekatna:%.3f%n", rect.getDiagonal());


        /*
        Zad3.Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę.
        Klasa powinna mieć następujące metody:
        -MyNumber isOdd() - true jeśli atrybut jest nieparzysty,
        -MyNumber isEven() - true jeśli atrybut jest parzysty,
        -MyNumber sqrt() - pierwiastek z atrybutu,
        -MyNumber pow(MyNumber x) - atrybut podniesiony do potęgi x (przydatnej
         metody poszukaj w javadoc do klasy Math),
        -MyNumber add(MyNumber x) - zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
        -MyNumber subtract(MyNumber x) - zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
        */

        MyNumber mynumber = new MyNumber(3);
        MyNumber pow_number = new MyNumber(4);


        System.out.println("");
        System.out.println("Zad.3 MyNumber=" + mynumber.number);
        System.out.println("isEven:" + mynumber.isEven());
        System.out.println("isOdd:" + mynumber.isOdd());
        System.out.println("Sqrt:" + mynumber.sqrt());
        System.out.println("Power " + mynumber.number + "^" + pow_number.number + " is " + mynumber.power(pow_number));
        System.out.println("Adding " + mynumber.number + " to " + pow_number.number + " is " + mynumber.addition(pow_number));
        System.out.println("Substracting " + mynumber.number + " from " + pow_number.number + " is " + mynumber.substracting(pow_number));


    }

}
