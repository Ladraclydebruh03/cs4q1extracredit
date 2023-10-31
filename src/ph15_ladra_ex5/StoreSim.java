package ph15_ladra_ex5;
import java.util.ArrayList;

public class StoreSim {
  public static void main(String[] args) {
    // Create items
    Item i1 = new Item("Burger", "food", 50);
    Item i2 = new Item("Fries", "food", 30);
    Item i3 = new Item("Fried Chicken", "food", 70);

    Item i4 = new Item("Shampoo", "toiletries", 120);
    Item i5 = new Item("Soap", "toiletries", 65);
    Item i6 = new Item("Toothpaste", "toiletries", 95);

    Item i7 = new Item("T-shirt", "clothes", 200);
    Item i8 = new Item("Jeans", "clothes", 1200);
    Item i9 = new Item("Shoes", "clothes", 2300);

    // Create Stores
    Store mcdo = new Store("McDo");
    Store watsons = new Store("Watsons");
    Store mall = new Store("Supermall");

    mcdo.addItem(i1);
    mcdo.addItem(i2);
    mcdo.addItem(i3);

    watsons.addItem(i4);
    watsons.addItem(i5);
    watsons.addItem(i6);

    mall.addItem(i1);
    mall.addItem(i2);
    mall.addItem(i4);
    mall.addItem(i5);
    mall.addItem(i6);
    mall.addItem(i7);
    mall.addItem(i8);
    mall.addItem(i9);
    
    System.out.println("Foods in the mall:");
    mall.filterType("food");
    System.out.println();
    
    System.out.println("Items in the mall below or equal to 500:");
    mall.filterCheap(500);
    System.out.println();
    
    System.out.println("Items in the mall equal or higher than 1000");
    mall.filterExpensive(1000);
    System.out.println();
    
    mcdo.sellItem(0);
    System.out.println();
    
    mcdo.sellItem(50);
    System.out.println();
    
    watsons.sellItem("Soap");
    System.out.println();
    
    watsons.sellItem("Mouthwash");
    System.out.println();
    
    mall.sellItem(i7);
    System.out.println();
    
    mall.sellItem(i3);
    System.out.println();

    // Check final earnings
    Store.printStats();
  }
}
