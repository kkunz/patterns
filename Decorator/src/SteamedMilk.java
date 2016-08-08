/**
 * Created by Karl on 8/8/2016.
 */
public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , SteamedMilk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }


}
