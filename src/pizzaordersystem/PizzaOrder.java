/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordersystem;

import java.util.ArrayList;

/**
 *
 * @author Chase Scallion
 */
public class PizzaOrder {
    private int orderNumber;
    private int size;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private boolean completed;
    private static int currentOrderNumber = 1;

    public PizzaOrder(int size) {
        this.size = size;
        completed = false;
        orderNumber = currentOrderNumber;
        currentOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public void addTopping(Topping t) {
        toppings.add(t);
    }
    
    public double calculateOrder() {
        double totalPrice = 0;
        double sizePrice = 0;
        double toppingPrice = 0;
        if(size == 0) {
            sizePrice = 9.25;
        }else if(size == 1) {
            sizePrice = 10.95;
        }else if(size == 2) {
            sizePrice = 12.95;
        }else if(size == 3) {
            sizePrice = 14.95;
        }
        
        for(int i = 0; i < toppings.size(); i++) {
            toppingPrice += toppings.get(i).getPrice();
        }
        
        totalPrice = sizePrice + toppingPrice;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" + "orderNumber=" + orderNumber + ", size=" + size + ", toppings=" + toppings + '}';
    }
    
    public String toppingToString() {
        return "Toppings: " + toppings;
    }
}
