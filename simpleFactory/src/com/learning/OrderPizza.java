
package com.learning;

public class OrderPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		
		PizzaStore  myPizzaStore = new PizzaStore(factory);
		
		myPizzaStore.orderPizza("veggie");
		
		

	}

}
