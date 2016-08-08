

/**
 * Created by Karl on 8/8/2016.
 */
public  class CoffeeShop {
    public static void main(String args[]) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage myCoffeeOrder = new DarkRoast();
        myCoffeeOrder = new Mocha(myCoffeeOrder);
        myCoffeeOrder = new Mocha(myCoffeeOrder);
        myCoffeeOrder = new Whip(myCoffeeOrder);
        System.out.println(myCoffeeOrder.getDescription() + " $" + myCoffeeOrder.cost());

        Beverage myNextCoffe = new HouseBlend();
        myNextCoffe = new Soy(myNextCoffe);
        myNextCoffe = new Mocha(myNextCoffe);
        myNextCoffe = new Whip(myNextCoffe);

        System.out.println(myNextCoffe.getDescription() + " $" + myNextCoffe.cost());



    }
}
