
package com.learning;

public class Pepperoni extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Roll out the dough");
		System.out.println("put on some pizza sauce");;
		System.out.println("add a bunch of yummy cheese");
		System.out.println("add a bunch of yummy pepperoni");
		
 
	}

	@Override
	public void bake() {
		System.out.println("Bake at 400 degrees for 25 minutes");

	}

}
