/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ase.bm.patterns.beverages;

/**
 *
 * @author tharindu
 */
public class Tea implements Beverage {

    public static int DEFAULT_QUANTITY = 10;

    private String name;
    private int quantity;

    public Tea() {
        this.name = "Tea";
        this.quantity = DEFAULT_QUANTITY;
    }

    public Tea(int quantity){
        this.name = "Tea";
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
        System.out.println("[Tea] making tea");
    }
}
