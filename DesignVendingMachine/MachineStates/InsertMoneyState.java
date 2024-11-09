package DesignVendingMachine.MachineStates;

import DesignVendingMachine.CurrencyType;
import DesignVendingMachine.VendingMachine;

public class InsertMoneyState extends VendingMachineState{

    public InsertMoneyState(VendingMachine vendingMachine){
        super(vendingMachine);
    }

    @Override
    public void insertMoney(int value) {
        vendingMachine.totalMoney += value;
        System.out.println("Inserted money " + value + " total balance " + vendingMachine.totalMoney);
    }

    @Override
    public void selectProduct() {
        System.out.println("Incorrect button");
    }

    @Override
    public void dispenseProduct() {
        vendingMachine.setState(new DispenseMachineState(vendingMachine));
        //vendingMachine.getState().dispenseProduct();
    }

    @Override
    public void chooseProduct(int productid) {
        System.out.println("Incorrect button");
    }

    @Override
    public void addMoney() {
        System.out.println("Please insert money");
    }

    
}
