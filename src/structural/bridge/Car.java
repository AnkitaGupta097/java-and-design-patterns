package structural.bridge;

class Car extends Vehicle{
    public Car(Gear gear){
        super(gear);
    }
    public void addGear(){
        System.out.print("Car handles ");
        gear.handleGear();
    }
}
