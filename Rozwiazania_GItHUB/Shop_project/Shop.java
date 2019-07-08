package Shop_project;

/*
Zadanie basket.
Napisz program, który będzie reprezentował koszyk w sklepie internetowym. 
Do koszyka reprezentowanego przez klasę Basket możemy dodawać bądź usuwać 
kolejne przedmioty. Każdy przedmiot powinien mieć nazwę i cenę jednostkową.
Koszyk powinien także pozwalać na dodanie/usunięcie od razu kilku egzemplarzy
przedmiotu ze sklepu. Koszyk powinien także być w stanie policzyć sumaryczną 
wartość zamówienia oraz wyświetlić swoją zawartość. Pamiętaj o poprawnym obsłużeniu
sytuacji wyjątkowych np. usunięcie elementów z pustego koszyka czy dodaniu ujemnej liczby przedmiotów.
Napisz zestaw testów jednostkowych potwierdzających poprawne działanie Twojego koszyka z zakupami.
Drobna podpowiedź z przykładowym zestawem klas, które mogą rozwiązać ten problem:
Item, która posiada dwa atrybuty double price4 oraz String name,
Basket, który posiada atrybut Map orderedItems reprezentujący zamówione towary wraz z ich ilością.
*/

import java.util.HashMap;
import java.util.Map;

public class Shop {

    public static int qtyInBasket = 0;
    public static Map<Item, Integer> products;
    public static Item item1, item2, item3, item4;


    public static void main(String[] args) {


        item1 = new Item("Whey protein", 20);
        item2 = new Item("Multivitamins", 2);
        item3 = new Item("Kreatyna", 45);
        item4 = null;

        products = new HashMap<>();
        addItemToBasket(products, item1, 5);
        addItemToBasket(products, item2, 5);
        addItemToBasket(products, item3, 5);

        basketSummary(products);

        removeItem(products, item1, 119);
        removeItem(products, item2, 4);
        removeItem(products, item3, 3);

        basketSummary(products);
    }//end of main method

    public static void addItemToBasket(Map<Item, Integer> products, Item item, int qty) {

        if (item == null || qty <= 0) {
            System.out.println("Niewlasciwa ilosc produktu lub produkt nie przekazany do koszyka.");
            return;
        }
        if (products.containsKey(item)) {
            qtyInBasket = products.get(item);
            qtyInBasket += qty;
            products.put(item, qtyInBasket);
        } else {
            qtyInBasket = qty;
            products.put(item, qtyInBasket);
        }
        System.out.println("Dodano produkt:" + item.getName() + " do koszyka.");


    }//end of addToBasket method

    public static void removeItem(Map<Item, Integer> products, Item item, int qty) {
        if (item == null || qty <= 0) {
            System.out.println("Niewlasciwa ilosc produktu lub nie produkt nie przekazany do koszyka.");
            return;
        }
        if (products.containsKey(item)) {

            qtyInBasket = products.get(item);//odczyt z mapy ile jest danego itemu w koszyku
            if (qtyInBasket <= qty) {
                System.out.println("Usunieto produkt:" + item.getName() + " z koszyka");
                products.remove(item);
                return;
            } else {
                qtyInBasket -= qty;
                products.put(item, qtyInBasket);
                System.out.println("Usunieto produkt:" + item.getName() + ",w ilosci:" + qty + " z koszyka");
            }
        }
    }//end of removeItem method

    public static void basketSummary(Map<Item, Integer> products) {

        System.out.println("Lista zamowienia:");
        int summaryPrice = 0;
        for (Item item : products.keySet()) {
            int qty = products.get(item);
            summaryPrice += ((item.getPrice()) * qty);
            System.out.println("Produkt:" + item.getName() + " cena:" + item.getPrice() + " ilosc:" + qty);
        }
        System.out.println("Sumaryczna cena:" + summaryPrice + " PLN");
        System.out.println("- Koniec listy -");
    }//end of basketSummary
}//end of shop class
