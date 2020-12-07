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
public class PizzaOrderModel {
    
    private ArrayList<PizzaOrder> orders = new ArrayList<>();

    
    public void addOrder(PizzaOrder o) {
        orders.add(o);
    }
    
    //FIXME: Implement completeOrder() method
    public double completeOrder(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getOrderNumber() == orderNum && orders.get(i).isCompleted() != true) {
                orders.get(i).setCompleted(true);
                return orders.get(i).calculateOrder();
            }
        }
        return -1;
    }
    
    
    //FIXME: Implement cancelOrder() method
    public boolean cancelOrder(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getOrderNumber() == orderNum && orders.get(i).isCompleted() != true) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }
   
    
    //FIXME: Implement displayIncompleteOrders() method
    public void displayIncompleteOrders() {
        for (int i = 0; i < orders.size(); i++) {
            if(!orders.get(i).isCompleted())
            System.out.println(orders.get(i).toString());
        }
    }
        
}
