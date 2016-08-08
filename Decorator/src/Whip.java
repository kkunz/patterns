/**
 * Created by Karl on 8/8/2016.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }


}
