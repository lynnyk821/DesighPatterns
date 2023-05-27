package Composite;

import java.util.ArrayList;
import java.util.List;

public class Order implements Component {
    private int maxPrice, maxWeight;
    private final List<Item> items = new ArrayList<>();
    public Order(int maxPrice, int maxWeight){
        this.maxPrice = maxPrice;
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item) {
        if(calcPrice() + item.calcPrice() <= maxPrice && item.calcWeight() <= maxWeight){
            items.add(item);
        }
    }
    @Override
    public double calcPrice(){
        return items.stream().mapToDouble(Component::calcPrice).sum();
    }
    @Override
    public int calcWeight(){
        int sum = 0;
        for(int i = 0; i < items.size(); i++){
            sum += items.get(i).calcWeight();
        }
        return sum;
        //return items.stream().mapToInt(Item::calcWeight).sum();
    }
    @Override
    public void print(){
        System.out.println("Order size: " + items.size() + " price: " + calcPrice() + " weight: " + calcWeight() + ".");
    }
}
