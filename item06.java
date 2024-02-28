import java.util.Scanner;
public class item06 {
    public String name;
    public double price;
    public int stock;
 
    public item06() {
    
    }
    
    public item06(String item06Name, double item06Price, int item06Stock) {
        name = item06Name;
        price = item06Price;
        stock = item06Stock;
    
    }
    
    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Price:" + price);
        System.out.println("Stock:" + stock);
    }
}

