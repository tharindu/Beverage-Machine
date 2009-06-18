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
public class MakeState implements State {
    private BeverageMachine bm;
    private Beverage beverage;
    public MakeState(BeverageMachine bm) {
        this.bm = bm;
        this.beverage = bm.getBeverage();
    }

    public void insertMoney() {
        System.out.println("[MakeState] can't insert money");
    }

    public void returnMoney() {
        System.out.println("[MakeState] can't return money processing.. tea");
    }

    public void refill() {
        System.out.println("[MakeState] refilling");
    }

    public void makeBeverage() {
        if(beverage.getQuantity()>0) {
            System.out.println("[MakeState] making selected beverage...");
            beverage.makeBeverage();
            bm.setState(new NoCoinInsertedState(bm));
        } else {
            System.out.println("[MakeState] out of beverage requested, take your money out");
            bm.setState(new OutOfRequestedBeverage(bm));
        }
    }

    public void selectBeverage() {
        System.out.println("[MakeState] already selected a beverage");
    }
}
