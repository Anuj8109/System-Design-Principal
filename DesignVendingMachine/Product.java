package DesignVendingMachine;


public class Product {
    private static int id = 1;
    public int productId;
    public String name;
    public int price;
    public String description;

    public Product(int price, String name, String description){
        productId = id++;
        this.price = price;
        this.name = name;
        this.description = description;
    }

}
