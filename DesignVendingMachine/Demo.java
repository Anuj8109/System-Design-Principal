package DesignVendingMachine;

public class Demo {
    

    public static void main(String[] args){
        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.getState().addMoney();
        vendingMachine.getState().selectProduct();
        vendingMachine.getState().chooseProduct(1);
        vendingMachine.getState().chooseProduct(2);
        vendingMachine.getState().chooseProduct(1);
        vendingMachine.getState().chooseProduct(2);
        vendingMachine.getState().addMoney();
        
        vendingMachine.getState().insertMoney(16);
        vendingMachine.getState().insertMoney(10);
        vendingMachine.getState().insertMoney(15);
        vendingMachine.getState().refundMoney();
        vendingMachine.getState().addMoney();
        vendingMachine.getState().selectProduct();
        vendingMachine.getState().chooseProduct(1);
        vendingMachine.getState().chooseProduct(2);
        vendingMachine.getState().chooseProduct(1);
        vendingMachine.getState().chooseProduct(2);
        vendingMachine.getState().addMoney();
        
        vendingMachine.getState().insertMoney(16);
        vendingMachine.getState().insertMoney(10);
        vendingMachine.getState().insertMoney(15);
        vendingMachine.getState().dispenseProduct();
    }
}
