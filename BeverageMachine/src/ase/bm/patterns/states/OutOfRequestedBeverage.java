/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ase.bm.patterns.states;

import ase.bm.patterns.BeverageMachine;
import ase.bm.patterns.beverages.Beverage;

/**
 *
 * @author tharindu
 */
public class OutOfRequestedBeverage implements State{

    BeverageMachine bm;
    Beverage beverage;

    public OutOfRequestedBeverage(BeverageMachine bm) {
        this.bm = bm;
        this.beverage = bm.getBeverage();
    }

    public void insertMoney() {
        System.out.println("[OutOfRequestedBeverage] out of requested beverage, please take your money already inserted");;
    }

    public void returnMoney() {
        System.out.println("[OutOfRequestedBeverage] returning money");;
    }

    public void refill() {
        System.out.println("[OutOfRequestedBeverage] refilling");;
    }

    public void makeBeverage() {
        System.out.println("[OutOfRequestedBeverage] out of beverage requested");;
    }

    public void selectBeverage() {
        System.out.println("[OutOfRequestedBeverage] already selected a beverage and its over");
    }

}
