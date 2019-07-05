package Shop_project.Shop_tests;

/*
test klasy Shop metody addToBasket i removeItem
*/
import Shop_project.Item;
import Shop_project.Shop;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AddItemToBasketTest{
    public static Item item1,testItem2,testItem3;
    public Shop testShop;
    
    public Map<Item,Integer> products;

    @Before
    public void preparingTest(){
        System.out.println("preparing list of products..");
        testShop = new Shop();
        //preparing list of products
        //creating test items: (name, price)
        item1 = new Item("testItem1",10);
        testItem2 = new Item("testItem2",20);
        testItem3 = new Item("testItem3",30);
       
        products = new HashMap<>();
        products.put(item1,1);
        products.put(testItem2,1);
        products.put(testItem3,1);

        System.out.println("test items added...");
    }// end of preparingTest method

    @Test
    public void checkIfItemsAreAdded(){
        System.out.println("performing test checkIfItemsAreAdded...");
                   
        Shop.addItemToBasket(item1,5);
        // -- nie wykonuje tej metody!!! --
        Shop.addItemToBasket(testItem2,6);
        Shop.addItemToBasket(testItem3,7);
        
        //performing test
        Assert.assertTrue(products.containsKey(item1));//should return true
        Assert.assertTrue(products.containsKey(testItem2));//should return true
        Assert.assertTrue(products.containsKey(testItem3));//should return true
        System.out.println("--end of test--");
    
    @Test
    public void checkIfItemsAreRemoved(){
        System.out.println("performing test checkIfItemsAreRemoved...");

        Shop.removeItem(item1,-1);
        System.out.println("should return warning message?");
        Shop.removeItem(item1,0);
        System.out.println("should return warning message?");
        
        Shop.removeItem(item1,1);
         // -- nie wykonuje tej metody!!! --
        Shop.removeItem(testItem2,1);
        Shop.removeItem(testItem3,1);
//checking results
        Assert.assertTrue(products.containsKey(item1));//should return false
        Assert.assertTrue(products.containsKey(testItem2));//should return false
        Assert.assertTrue(products.containsKey(testItem3));//should return false
    }
    @After
    public void listOfProducts(){

        int summaryPrice =0;
        System.out.println("List of products in Test List");
        for(Item item:products.keySet()){
            int qty= products.get(item);
            summaryPrice+=((item.getPrice())*qty);
            System.out.println("Produkt:"+item.getName()+" cena:"+item.getPrice()+" ilosc:"+qty);

        }//end of for..each loop
        System.out.println("- End of list -");
       System.out.flush();
    }//end of listOfProducts method

}//end of addToBasketTest class