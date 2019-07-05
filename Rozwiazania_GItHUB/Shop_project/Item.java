package Shop_project;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }//end of Item constructor

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Item) {
            Item secondItem = (Item) obj;
            return name.equals(secondItem.name) && price == secondItem.price;
        }
        return false;
    }//end of equals method

    @Override
    public int hashCode() {
        return 17 * name.hashCode() + 31 * price;
    }//end of hash Code method

    @Override
    public String toString() {
        return this.getClass().getName() + " produkt:" + this.name + " cena:" + this.price;
    }

}// end of Item class
