package pl.samouczek.basket;

import java.util.HashMap;
import java.util.Map;


public class Basket {

    private Item item;
    public int qty;
    private int qtyInBasket = 0;
    private Map<Item, Integer> products = new HashMap<>();

    public void checkArguments(Item checkedItem, int checkedQty) {

        if (checkedItem == null || checkedQty <= 0) {
            System.out.println();
            qty = checkedQty;
            throw new IllegalArgumentException("Niewlasciwa ilosc produktu lub produkt nie przekazany do koszyka.");
        }
    }

    public void addItemToBasket(Item item, int qty) {

        checkArguments(item, qty);

        if (products.containsKey(item)) {
            qtyInBasket = products.get(item);
            qtyInBasket += qty;
            products.put(item, qtyInBasket);
        } else {
            qtyInBasket = qty;
            products.put(item, qtyInBasket);
        }
        System.out.println("Dodano produkt:" + item.getName() + " do koszyka.");
    }

    public void removeItem(Item item, int qty) {
        checkArguments(item, qty);

        if (products.containsKey(item)) {

            qtyInBasket = products.get(item);
            if (qtyInBasket <= qty) {
                System.out.println("Usunieto calkowicie produkt:" + item.getName() + " z koszyka");
                products.remove(item);
                return;
            } else {
                qtyInBasket -= qty;
                products.put(item, qtyInBasket);
                System.out.println("Usunieto produkt:" + item.getName() + ",w ilosci:" + qty + "sztuk z koszyka");
            }
        }
    }

    public void basketSummary() {

        System.out.println("Lista zamowienia:");
        int summaryPrice = 0;
        for (Item item : products.keySet()) {
            int qty = products.get(item);
            summaryPrice += ((item.getPrice()) * qty);
            System.out.println("Produkt:" + item.getName() + " cena:" + item.getPrice() + " ilosc:" + qty);
        }
        System.out.println("Sumaryczna cena:" + summaryPrice + " PLN");
        System.out.println("- Koniec listy -");
    }
}

