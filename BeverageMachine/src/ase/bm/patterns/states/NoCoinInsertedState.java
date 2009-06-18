package ase.bm.patterns.states;

import ase.bm.patterns.BeverageMachine;

/**
 *
 * @author tharindu
 */
public class NoCoinInsertedState implements State {

    BeverageMachine bm;

    public NoCoinInsertedState(BeverageMachine bm) {
        this.bm = bm;
    }

    public void insertMoney() {
        System.out.println("[NoCoinInsertedState] money inserted");
        bm.setState(new CoinInsertedState(bm));
    }

    public void returnMoney() {
        System.out.println("[NoCoinInsertedState] nothing to return");
    }

    public void refill() {
        System.out.println("[NoCoinInsertedState] refilling machine");
    }

    public void makeBeverage() {
        System.out.println("[NoCoinInsertedState] please insert money and select beverage");
    }

    public void selectBeverage() {
        System.out.println("[NoCoinInsertedState] please insert money first");
    }
}
