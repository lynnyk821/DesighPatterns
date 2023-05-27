package Composite;

public class Item implements Component {
    private final String name;
    private final double price;
    private final int weight;
    public Item(String name, double price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public double calcPrice(){
        return price;
    }
    @Override
    public int calcWeight(){
        return weight;
    }
    @Override
    public void print(){
        System.out.println("Item name is " + name + " price = " + price + " weight = " + weight + ".");
    }
}
