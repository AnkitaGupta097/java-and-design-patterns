package structural.decorator;

 class VendingMachineDecorator {
    public static void main(String args[]){
        Beverage beverage = new SugarDecorator(new LemonDecorator(new Tea("Assam Tea",100)));
        System.out.println(beverage.calculatePrice());
        beverage = new SugarDecorator(new Coffee("Cappuccino", 50));
        System.out.println(beverage.calculatePrice());
    }
}
