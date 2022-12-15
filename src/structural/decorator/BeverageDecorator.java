package structural.decorator;

abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract int getIncrementPrice();
}
