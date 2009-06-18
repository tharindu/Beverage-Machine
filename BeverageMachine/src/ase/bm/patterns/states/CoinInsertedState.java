package ase.bm.patterns.states;

import ase.bm.patterns.BeverageMachine;

/**
 *
 * @author tharindu
 */
public class CoinInsertedState implements State {

    BeverageMachine bm;

    public CoinInsertedState(BeverageMachine bm) {
        this.bm = bm;
    }

    public void insertMoney() {
        System.out.println("[CoinInsertedState] money already inserted");
    }

    public void returnMoney() {
        System.out.println("[CoinInsertedState] reurning money");
    }

    public void refill() {
        System.out.println("[CoinInsertedState] refilling machine");
    }

    public void makeBeverage() {
        System.out.println("[CoinInsertedState] please select beverage");
    }

    public void selectBeverage() {
        bm.setState(new MakeState(bm));
        System.out.println("[CoinInsertedState] selected beverage");
    }
}
