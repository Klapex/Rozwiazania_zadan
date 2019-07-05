package Shop_project;

import java.util.Map;
import java.util.HashMap;

public class Shop {
    public static int qty = 0;
    public static int qtyInBasket = 0;
    public static Map<Item, Integer> products;
    public static Item item1, item2, item3;


    public static void main(String[] args) {
        item1 = new Item("Whey protein", 10);
        item2 = new Item("Multivitamins", 20);
        //item3 = item1;
        item3 = new Item("Whey protein", 64);
        products = new HashMap<>();
        addItemToBasket(item1, 120);
        addItemToBasket(item2, 20);

        System.out.println("item 1 (whey) = item2 (vitamins)?" + item1.equals(item2));
        System.out.println("item 2 (vitamins) = item3 (whey)?" + item2.equals(item3));
        System.out.println("item 1 (whey) = item3 (whey)?" + item1.equals(item3));
        basketSummary();

        removeItem(item1, 119);
        removeItem(item2, 19);

        basketSummary();
    }//end of main method

    public static void addItemToBasket(Item item, int qty) {
        if (qty <= 0) {
            System.out.println("Prosze podawac wartosci wieksze od zera.");
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

    public static void removeItem(Item item, int qty) {
        if (qty <= 0) {
            System.out.println("Prosze podawac wartosci wieksze od zera.");
            return;
        }
        if (products.containsKey(item)) {

            qtyInBasket = products.get(item);//odczyt z mapy ile jest danego itemu w koszyku
            if (qtyInBasket <= qty) {
                System.out.println("Usunieto produkt:" + item.getName() + "z koszyka");
                products.remove(item);
                return;
            }
            // gdy poprzedni if nie spelni warunku to:
            qtyInBasket -= qty;
            products.put(item, qtyInBasket);
        }
    }//end of removeItem method

    public static void basketSummary() {
//obliczanie sumarycznej kwoty zamowienia
        System.out.println("Lista zamowienia:");
        int summaryPrice = 0;
        for (Item item : products.keySet()) {
            int qty = products.get(item);
            summaryPrice += ((item.getPrice()) * qty);
            System.out.println("Produkt:" + item.getName() + " cena:" + item.getPrice() + " ilosc:" + qty);
        }
        System.out.println("Sumaryczna cena:" + summaryPrice + " PLN");
    }//end of basketSummary
}//end of shop class