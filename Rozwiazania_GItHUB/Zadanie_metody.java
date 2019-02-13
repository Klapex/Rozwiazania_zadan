package pl.samouczek.zbior_zadan;

/*
 Zadanie: metody w jezyku java zadanie 1 do 8
 */

public class Zadanie_metody {
    public static void main(String[] args) {

        // Dane:
        int wiek = 37;
        String imie = "Raf";
        double a = 5;//metoda math i toPower
        double b = 6;//metoda math
        int c = 6;//metoda isEven
        int d = 120;//metoda isDivided
        int bok1 = 3;
        int bok2 = 4;
        int bok3 = 5;// do metody triangle i triangle2


        System.out.println("Twoj wiek to:" + getAge(wiek));
        System.out.println("Imie:" + getName(imie));
        Zadanie_metody.math(a, b);
        System.out.println("Czy c=" + c + " jest parzysta?" + isEven(c));
        System.out.println("Czy liczba d="+d+" jest podzielna przez 3 i 5? " + isDivided(d));
        System.out.println("liczba " + a + "^3=" + toPower(a));
        System.out.println("czy mozna utworzyc trojakt z a=" + bok1 + ",b=" + bok2 + ",c=" + bok3 + "?");
        System.out.println("? " + Zadanie_metody.triangle(bok1, bok2, bok3));
        // druga metoda:
        System.out.println("czy mozna utworzyc trojakt z a=" + bok1 + ",b=" + bok2 + ",c=" + bok3 + "?");
        System.out.println("? " + Zadanie_metody.triangle2(bok1, bok2, bok3));

    }

    public static int getAge(int age) {
        return age;
    }

    public static String getName(String name) {
         return name;
    }

    public static void math(double c, double d) {
        System.out.println("a=" + c + ",b=" + d);
        System.out.println("Suma a+b=" + (c + d));
        System.out.println("Roznica a-b=" + (c - d));
        System.out.println("Iloczyn a*b=" + (c * d));
    }

   public static boolean isEven(int liczba) {
        return liczba % 2 == 0;
    }

    public static boolean isDivided(int liczba2) {

        return liczba2 % 3 == 0 && liczba2 % 5 == 0;
    }

    public static double toPower(double liczba3) {
        return Math.pow(liczba3, 3);

    }

    public static boolean triangle(int arg1, int arg2, int arg3) {

        return (arg1 + arg2) > arg3 && (arg2 + arg3) > arg1 && (arg1 + arg3) > arg2;

    }

    public static boolean triangle2(int arg1, int arg2, int arg3) {

        if ((arg1 + arg2) > arg3) {
            if ((arg2 + arg3) > arg1) {
                return (arg1 + arg3) > arg2;
            }
        }
        return false;
    }

}


