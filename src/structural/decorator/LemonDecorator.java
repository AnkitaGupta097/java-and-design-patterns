package structural.decorator;

public class LemonDecorator extends BeverageDecorator{

    public LemonDecorator(Beverage beverage){
        super(beverage);
    }

    public int getIncrementPrice(){
        return 10;
    }

    @Override
    public int calculatePrice(){
        return getIncrementPrice()+ beverage.calculatePrice();
    }
}
