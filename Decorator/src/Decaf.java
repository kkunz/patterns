/**
 * Created by Karl on 8/8/2016.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }


    @Override
    public double cost() {
        return 1.05;
    }
}
