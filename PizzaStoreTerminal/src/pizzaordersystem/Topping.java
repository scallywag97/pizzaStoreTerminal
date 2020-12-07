/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordersystem;

/**
 *
 * @author Chase Scallion
 */
public enum Topping {
   
    PEPPERONI(1.5), CHICKEN(1.95), MEATBALLS(1.8), PEPPER(1), MUSHROOMS(1.5), ONIONS(1);
    
    private double price;
    
    Topping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
}
