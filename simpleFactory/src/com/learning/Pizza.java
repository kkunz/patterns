package com.learning;

public abstract class Pizza {

	abstract public void prepare();
	abstract public void bake();
	public void box() {
		System.out.println("Put the pizza into the box");
	}
	public void cut() {
		
		System.out.println("Cut pizza into 9 pieces");
	}
	
}
