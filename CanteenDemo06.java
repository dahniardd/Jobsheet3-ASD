import java.util.Scanner;
public class CanteenDemo06 {
    public static void main(String[] args) {
        item06 item1 = new item06();
        item1.name = "Bubur Ayam";
        item1.price = 12000;
        item1.stock = 20;
        item1.displayInfo();
        
        item06 item2 = new item06();
        item2.name = "Soto Ayam";
        item2.price = 15000;
        item2.stock = 20;
        item2.displayInfo();

        item06 item3 = new item06();
        item3.name = "Bakso Komplit";
        item3.price = 15000;
        item3.stock = 20;
        item3.displayInfo();

        item06 item4 = new item06();
        item4.name = "Es Teh Manis";
        item4.price = 7000;
        item4.stock = 20;
        item4.displayInfo();
}
}