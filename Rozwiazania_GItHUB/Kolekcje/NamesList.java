package Kolekcje;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

 /*
 Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie
 dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz
 liczbę unikalnych imion.
 */
public class NamesList {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Set<String> namesList = new HashSet<>();
         String name="";
         boolean contains=namesList.contains(name);

         System.out.println("Wprowadzanie unikalnych imion do bazy danych.");
         System.out.println("Wprowadz imie lub '-' aby zakonczyc.");
         while(true){
             System.out.println("Podaj imie:");
             name=input.nextLine();
             if(name.equals("-")){
                 System.out.println("Koniec wprowadzania.");
             break; }
             if(namesList.contains(name)){
                 System.out.println("To imie zostalo juz wprowadzone wczesniej.");
             }
             else{ namesList.add(name);
                 System.out.println("Imie dodane do listy.");}

         }

         System.out.println("Lista zawiera "+namesList.size()+" unikalnych imion.");
         System.out.println("Oto one:");
         for(String names:namesList){
             System.out.println(names);
         }

     }


}
