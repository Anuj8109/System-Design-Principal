package DesignVendingMachine.MachineStates;

import DesignVendingMachine.CurrencyType;
import DesignVendingMachine.Product;
import DesignVendingMachine.VendingMachine;

public class DispenseMachineState extends VendingMachineState{

    public DispenseMachineState(VendingMachine vendingMachine){
        super(vendingMachine);
        dispenseProduct();
    }
    @Override
    public void insertMoney(int money) {
        System.out.println("Incorrect Product");
    }

    @Override
    public void selectProduct() {
        System.out.println("Incorrect Product");
    }

    @Override
    public void dispenseProduct() {
        int orderValue = 0;
        for(Product product:vendingMachine.selectedProduct.keySet()){
            int availQuantity = vendingMachine.inventory.productList.get(product);
            int requiredQuantity = vendingMachine.selectedProduct.get(product);
            if(requiredQuantity > availQuantity){
                vendingMachine.selectedProduct.put(product, availQuantity);
                requiredQuantity = availQuantity;
            }
            availQuantity -= requiredQuantity;
            orderValue += (product.price * requiredQuantity);
        }

        if(orderValue <= vendingMachine.totalMoney){
            vendingMachine.totalMoney -= orderValue;
            for(Product product:vendingMachine.selectedProduct.keySet()){
                System.out.println(product.name + " Price " + product.price + " quantity " + vendingMachine.selectedProduct.get(product));
            }
        }else{
            System.out.println("Insufficent Money");
        }
        super.refundMoney();
        vendingMachine.setState(new IdleVendingMachingState(vendingMachine));
    }

    @Override
    public void chooseProduct(int productid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }
    @Override
    public void addMoney() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMoney'");
    }

    @Override
    public void refundMoney(){
        System.out.println("Incorrect Product");
    } 
    
}
