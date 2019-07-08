package Shop_project.Shop_tests;

/*
testy klasy Shop i Item
*/

import Shop_project.Item;
import Shop_project.Shop;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AddItemToBasketTest {
    public static Item testItem1, testItem2, testItem3,testItem4;
    public Map<Item, Integer> testProductsList;

    @Before
    public void preparingTest() {

        System.out.println("Preparing list of products..");

        //preparing list of products
        //creating test items: (name, price)

        testItem1 = new Item("testItem1", 10);
        testItem2 = new Item("testItem2", 20);
        testItem3 = new Item("testItem3", 30);
        testItem4 = null;

        testProductsList = new HashMap<>();

        //adding testItems for removing from basket
        testProductsList.put(testItem1, 2);
        testProductsList.put(testItem2, 2);
        testProductsList.put(testItem3, 2);

    }// end of preparingTest method

    @Test
    public void checkIfItemsAreAdded() {

        System.out.println("Testing 'addItemToBasket' method...");

        System.out.println("Adding products to basket...");
        System.out.println("should return warning message?->-1");
        Shop.addItemToBasket(testProductsList, testItem1, -1);
        System.out.println("should return warning message 2nd time?->0");
        Shop.addItemToBasket(testProductsList, testItem1, 0);
        System.out.println("should return warning message 3rd time? -> null");
        Shop.addItemToBasket(testProductsList, testItem4, 10);

        Shop.addItemToBasket(testProductsList, testItem1, 1);
        Shop.addItemToBasket(testProductsList, testItem2, 2);
        Shop.addItemToBasket(testProductsList, testItem3, 3);

        //Assertions  

        Assert.assertTrue(testProductsList.containsKey(testItem1));//should return true
        Assert.assertTrue(testProductsList.containsKey(testItem2));//should return true
        Assert.assertTrue(testProductsList.containsKey(testItem3));//should return true
        System.out.println("--end of 'checkIfItemsAreAdded' test--");

    }//end of checkIfItemAreAdded method         

    @Test
    public void checkIfItemsAreRemoved() {

        System.out.println("Testing 'removeItem' method...");


        System.out.println("should return warning message?->-1");
        Shop.removeItem (testProductsList, testItem1, -1);
        System.out.println("should return warning message 2nd time?->0");
        Shop.removeItem(testProductsList, testItem1, 0);
        System.out.println("should return warning message 3rd time? -> null");
        Shop.removeItem(testProductsList, testItem4, 10);

        Shop.removeItem(testProductsList, testItem1, 1);
        Shop.removeItem(testProductsList, testItem2, 10);
        Shop.removeItem(testProductsList, testItem3, 1);

        // Assertions
        Assert.assertTrue(testProductsList.containsKey(testItem1));//wszystkie powinny zwrocic true
        Assert.assertFalse(testProductsList.containsKey(testItem2));
        Assert.assertTrue(testProductsList.containsKey(testItem3));
        System.out.println("--end of 'checkIfItemsAreRemoved' test--");
    }

    @Test
    public void equalsMethodTest(){

        System.out.println(" Testing 'equals' method...");
        System.out.println("item 1 (whey) = item2 (vitamins)?" + testItem1.equals(testItem2));
        System.out.println("item 2 (vitamins) = item3 (whey)?" + testItem2.equals(testItem3));
        System.out.println("item 3 (whey) = item3 (whey)?" + testItem3.equals(testItem3));
        System.out.println("--end of 'equalsMethodTest' test--");
    }


    @After
    public void listOfProducts() {
        System.out.println("List of products in Test List");
        Shop.basketSummary(testProductsList);

        System.out.flush();
    }//end of listOfProducts method

}//end of addToBasketTest class
