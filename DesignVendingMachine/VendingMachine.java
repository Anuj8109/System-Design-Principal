package DesignVendingMachine;

import java.util.HashMap;
import java.util.Scanner;

import DesignVendingMachine.MachineStates.IdleVendingMachingState;
import DesignVendingMachine.MachineStates.InsertMoneyState;
import DesignVendingMachine.MachineStates.SelectProductState;
import DesignVendingMachine.MachineStates.VendingMachineState;

public class VendingMachine {
    public VendingMachineState state;
    public Inventory inventory;
    private static VendingMachine instance;
    public int totalMoney;
    public HashMap<Product,Integer> selectedProduct;

    private VendingMachine(){
        this.state = new IdleVendingMachingState(this);
        inventory = new Inventory();
        selectedProduct = new HashMap<>();
        inventory.addNewProduct(new Product(1, "Sugar bag", "Sugar"), 10);
        inventory.addNewProduct(new Product(2, "Coffee bag", "Coffee"),20);
        inventory.addNewProduct(new Product(5, "Milk", "Milk"), 5);
    }

    public static synchronized VendingMachine getInstance(){
        if(instance == null){
            instance = new VendingMachine();
        }
        return instance;
    }

    public void setState(VendingMachineState state){
        this.state = state;
    } 

    public VendingMachineState getState(){
        return state;
    }

    //
}
