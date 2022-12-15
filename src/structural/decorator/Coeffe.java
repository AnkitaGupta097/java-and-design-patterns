package structural.decorator;

class Coffee extends Beverage{
    public Coffee(String name, int price){
        super(name,price);
    }
    public int calculatePrice(){
        return this.price;
    }
}