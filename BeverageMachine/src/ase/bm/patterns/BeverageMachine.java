package ase.bm.patterns;
import ase.bm.patterns.beverages.*;
import ase.bm.patterns.states.*;

/**
 *
 * @author tharindu
 */
public class BeverageMachine {

    private State state;
    private Beverage beverage;

    private static BeverageMachine beverageMachine = new BeverageMachine();

    public static int OPTION_TEA = 0;
    public static int OPTION_COFFEE = 1;

    public static BeverageMachine getInstance() {
        return beverageMachine;
    }



    public Beverage getBeverage() {
        return beverage;
    }

    public void setState(State state) {
        this.state = state;
    }
    /******************************************************************
     *             beverage machine main functions                    *
     *****************************************************************/
    public void makeBeverage(){
        state.makeBeverage();
    }

    public void selectBeverage(int option) {
        switch(option){
            case 0:
                this.beverage = new Tea();
                break;
            case 1:
                this.beverage = new Coffee();
                break;
            default:
                this.beverage = new Tea();
                break;
        }
        state.selectBeverage();
    }

    private void insertMoney() {
        state.insertMoney();
    }

    public void returnMoney() {
        state.returnMoney();
    }

    public void refill() {
        state.refill();
    }

    public static void main(String[] args) {
        BeverageMachine bm = BeverageMachine.getInstance();
        System.out.println("----[INSTRUCTION] Init Machine");
        bm.setState(new NoCoinInsertedState(bm));
        System.out.println("----[INSTRUCTION] Insert Money");
        bm.insertMoney();
        System.out.println("----[INSTRUCTION] Select Beverage");
        bm.selectBeverage(BeverageMachine.OPTION_TEA);
        System.out.println("----[INSTRUCTION] Make Beverage");
        bm.makeBeverage();
        System.out.println("----[INSTRUCTION] Return money");
        bm.returnMoney();
    }
    
}
