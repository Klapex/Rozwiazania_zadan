package pl.samouczek.zbior_zadan;

/*
    Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter
    (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy
    Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program,
    który pobierze od użytkownika:
    -długość promienia koła,
    - 2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
    -długość boków prostokąta.

    Utworzy instancje tych obiektów i umieści je w tablicy Figure[].
    Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
 */

import java.util.Scanner;

public class Zadanie_interfejsy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Figure[] figures = new Figure[3];
        String[] names = {"Triangle", "Retangle", "Circle"};

        System.out.println("podaj promien kola:");
        double radius = input.nextDouble();
        System.out.println("bok A prostokata:");
        double sideA_rect = input.nextDouble();
        System.out.println("bok B prostokata:");
        double sideB_rect = input.nextDouble();
        System.out.println("bok A trojkata:");
        double sideA_triangle = input.nextDouble();
        System.out.println("bok B trojkata:");
        double sideB_triangle = input.nextDouble();


        figures[0] = new Triangle(sideA_triangle, sideB_triangle);
        figures[1] = new Rectangle(sideA_rect, sideB_rect);
        figures[2] = new Circle(radius);

        answerPrintout(names, figures);
    }

    public static void answerPrintout(String names[], Figure[] figures) {
        System.out.println("Answer:");
        for (int i = 0; i < (figures.length); i++) {
            System.out.println(names[i]);
            System.out.println("Perimeter:" + figures[i].getPerimeter());
            System.out.println("Area:" + figures[i].getArea());
            System.out.println("");
        }

    }


}

