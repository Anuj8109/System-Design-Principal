package DesignVendingMachine.MachineStates;

import java.util.HashMap;

import DesignVendingMachine.CurrencyType;
import DesignVendingMachine.Product;
import DesignVendingMachine.VendingMachine;

public class IdleVendingMachingState extends VendingMachineState{

    public IdleVendingMachingState(VendingMachine vendingMachine){
        super(vendingMachine);
        vendingMachine.totalMoney = 0;
        vendingMachine.selectedProduct = new HashMap<>();
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Incorrect button");
    }

    @Override
    public void selectProduct() {
        vendingMachine.setState(new SelectProductState(vendingMachine));
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please Select product and Add Money");
    }

    @Override
    public void chooseProduct(int productid) {
        System.out.println("Incorrect button");
    }

    @Override
    public void addMoney() {
        System.out.println("Incorrect button");
    }
    
}
