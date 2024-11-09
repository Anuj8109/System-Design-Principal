package DesignVendingMachine.MachineStates;

import java.util.HashMap;

import DesignVendingMachine.CurrencyType;
import DesignVendingMachine.Product;
import DesignVendingMachine.VendingMachine;

public abstract class VendingMachineState {
    public VendingMachine vendingMachine;

    public VendingMachineState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public abstract void insertMoney(int money);
    public abstract void selectProduct();
    public abstract void dispenseProduct();
    public abstract void chooseProduct(int productid);
    public abstract void addMoney();

    public void refundMoney(){
        System.out.println("Refunding money " + vendingMachine.totalMoney);
        vendingMachine.setState(new IdleVendingMachingState(vendingMachine));
    }

}
