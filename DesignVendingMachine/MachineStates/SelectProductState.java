package DesignVendingMachine.MachineStates;

import DesignVendingMachine.CurrencyType;
import DesignVendingMachine.Inventory;
import DesignVendingMachine.Product;
import DesignVendingMachine.VendingMachine;

public class SelectProductState extends VendingMachineState{

    public SelectProductState(VendingMachine vendingMachine){
        super(vendingMachine);
    }
    @Override
    public void insertMoney(int money) {
        vendingMachine.setState(new InsertMoneyState(vendingMachine));
    }

    @Override
    public void selectProduct() {
        System.out.println("Incorrect button");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select produce and insert money");
    }

    @Override
    public void chooseProduct(int productid) {
        Product product = vendingMachine.inventory.geProduct(productid);
        vendingMachine.selectedProduct.put(product, vendingMachine.selectedProduct.getOrDefault(product, 0) + 1);
    }

    @Override
    public void addMoney() {
        vendingMachine.setState(new InsertMoneyState(vendingMachine));
        System.out.println("Incorrect button");
    }
    
}
