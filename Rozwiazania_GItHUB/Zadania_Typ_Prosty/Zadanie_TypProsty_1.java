package pl.samouczek.zbior_zadan;

public class Zadanie_TypProsty_1 {
    public static void main(String[] args) {
/*
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




    }

}
