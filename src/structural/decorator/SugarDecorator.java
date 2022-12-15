package structural.decorator;

class SugarDecorator extends BeverageDecorator{

public SugarDecorator(Beverage beverage){
        super(beverage);
        }

        public int getIncrementPrice(){
            return 5;
        }

        @Override
           public int calculatePrice(){
               return getIncrementPrice()+ beverage.calculatePrice();
        }
}