package DesignVendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    public HashMap<Product, Integer> productList;

    public Inventory(){
        this.productList = new HashMap<>();
    }

    public void addNewProduct(Product product, int quatity){
        if(productList.containsKey(product)){
            productList.put(product, productList.get(product) + quatity);
            System.out.println("Updated quantity of " + product.name + " Quantity " + productList.get(product));
        }
        productList.put(product, quatity);
    }

    public Product geProduct(int id){
        for(Product product:productList.keySet()){
            if(product.productId == id) return product;
        }
        return null;
    }
}
