package com.learning;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck brownDuck=  new BrownDuck();
	    brownDuck.setFlyBehavior(new FlyWithWings());
	    brownDuck.setQuackBehavior(new Quack());
	    brownDuck.setwalkBehavior(new WaddleWalk());
	    
	    brownDuck.performFly();
	    brownDuck.performQuack();
	    brownDuck.performWalk();

	}

}
