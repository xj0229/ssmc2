package com.xiejun.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    
    private List<String> productList = null;
    
    private static ProductList instance;
    
    private ProductList() {}
    
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }
    
    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }
    
    public void addProudct(String newProduct) {
        productList.add(newProduct);
        System.err.println("Add new Product:"+newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}