package ase.bm.patterns.states;

/**
 *
 * @author tharindu
 */
public interface State {

    public void insertMoney();

    public void returnMoney();

    public void refill();

    public void makeBeverage();

    public void selectBeverage();
}
