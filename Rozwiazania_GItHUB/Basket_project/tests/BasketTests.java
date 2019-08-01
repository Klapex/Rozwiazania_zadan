package pl.samouczek.basket.tests;

/**
Testy klasy Basket i Item
*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.samouczek.basket.Basket;
import pl.samouczek.basket.Item;

import java.util.HashMap;
import java.util.Map;

public class BasketTests {
    public Item testItem1, testItem2, testItem3, testItem4;
    public Map<Item, Integer> testProductsList;
    public Basket testBasket = new Basket();

    @Before
    public void preparingTest() {

        System.out.println("Preparing list of products..");

        testItem1 = new Item("testItem1", 10);
        testItem2 = new Item("testItem2", 20);
        testItem3 = new Item("testItem3", 30);
        testItem4 = null;

        testProductsList = new HashMap<>();

        testProductsList.put(testItem1, 2);
        testProductsList.put(testItem2, 2);
        testProductsList.put(testItem3, 2);
    }

    @Test
    public void checkIfItemsAreAdded() {

        System.out.println("Testing 'addItemToBasket' method...");
        System.out.println("Adding products to basket...");
        try {
            testBasket.addItemToBasket(testItem1, 1);
            testBasket.addItemToBasket(testItem2, 2);
            testBasket.addItemToBasket(testItem3, 3);
            testBasket.addItemToBasket(testItem1, -1);

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument:" + testBasket.qty + System.lineSeparator());
        }

        Assert.assertTrue(testProductsList.containsKey(testItem1));
        Assert.assertTrue(testProductsList.containsKey(testItem2));
        Assert.assertTrue(testProductsList.containsKey(testItem3));
        System.out.println("--end of 'checkIfItemsAreAdded' test--");
    }

    @Test
    public void checkIfItemsAreRemoved() {

        System.out.println("Testing 'removeItem' method...");
        testBasket.addItemToBasket(testItem1, 2);
        testBasket.addItemToBasket(testItem2, 2);
        testBasket.addItemToBasket(testItem3, 2);

        try {
            testBasket.removeItem(testItem1, 1);
            testBasket.removeItem(testItem2, 10);
            testBasket.removeItem(testItem3, 1);
            testBasket.removeItem(testItem4, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument:" + testBasket.qty + System.lineSeparator());
        }

        Assert.assertTrue(testProductsList.containsKey(testItem1));
        Assert.assertTrue(testProductsList.containsKey(testItem2));
        Assert.assertTrue(testProductsList.containsKey(testItem3));
        System.out.println("--end of 'checkIfItemsAreRemoved' test--");
    }

    @Test
    public void equalsMethodTest() {

        System.out.println(" Testing 'equals' method...");
        System.out.println("item 1 (whey) = item2 (vitamins)?" + testItem1.equals(testItem2));
        System.out.println("item 2 (vitamins) = item3 (whey)?" + testItem2.equals(testItem3));
        System.out.println("item 3 (whey) = item3 (whey)?" + testItem3.equals(testItem3));
        System.out.println("--end of 'equalsMethodTest' test--");
    }

    @After
    public void listOfProducts() {
        System.out.println("List of products in Test Basket");
        testBasket.basketSummary();
        System.out.flush();
    }
}
