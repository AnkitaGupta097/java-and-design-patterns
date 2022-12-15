package structural.decorator;

class Tea extends Beverage{
    public Tea(String name, int price){
        super(name,price);
    }

    @Override
    public int calculatePrice(){
        return this.price;
    }
}
