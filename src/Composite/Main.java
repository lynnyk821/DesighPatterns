package Composite;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("123", 299, 20);
        Item item2 = new Item("123", 100, 30);
        
        item1.print();
        item2.print();
        System.out.println();

        Order order = new Order(300, 30);

        order.addItem(item1);
        order.addItem(item1);
        order.addItem(item1);
        order.addItem(item2);

        order.print();

    }
}