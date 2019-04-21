package com.xiejun.observer;

public class ObserverTest {
	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
		JingDongObserver jdObserver = new JingDongObserver();
		observable.addObserver(jdObserver);
		observable.addObserver(taoBaoObserver);
		observable.addProudct("new pro111");
	}
}
