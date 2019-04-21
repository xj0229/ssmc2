package com.xiejun.observer;

import java.util.Observable;
import java.util.Observer;

public class TaoBaoObserver implements Observer {

    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.err.println("Send New Product:"+newProduct+"to Taobao!");
    }    
}