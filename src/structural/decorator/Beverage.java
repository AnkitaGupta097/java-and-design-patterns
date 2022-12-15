package structural.decorator;

abstract class Beverage {
    protected String name;
    protected int price;
    public Beverage(){

    }
    Beverage(String name, int price){
        this.name = name;
        this.price = price;
    }

     abstract int calculatePrice();
}
