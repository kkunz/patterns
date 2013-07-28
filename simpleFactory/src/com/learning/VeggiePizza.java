
package com.learning;

public class VeggiePizza extends Pizza {


	@Override
	public void prepare() {
		System.out.println("Roll out the dough");
		System.out.println("put on some pizza sauce");;
		System.out.println("add a bunch of onions");
		System.out.println("add tomatos");
		System.out.println("add mushrooms");

	}

	@Override
	public void bake() {
		System.out.println("Bake at 375 degrees for 35 minutes");

	}

}
