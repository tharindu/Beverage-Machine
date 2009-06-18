/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ase.bm.patterns.beverages;

/**
 *
 * @author tharindu
 */
public class Coffee implements Beverage {

    public static int DEFAULT_QUANTITY = 15;

    private String name;
    private int quantity;

    public Coffee() {
        this.name = "Coffee";
        this.quantity = DEFAULT_QUANTITY;
    }

    public Coffee(int quantity){
        this.name = "Coffee";
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void makeBeverage() {
        System.out.println("[Coffee] making coffee");
    }
}
