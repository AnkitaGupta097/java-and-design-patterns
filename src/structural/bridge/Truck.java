package structural.bridge;

class Truck extends Vehicle{
    public Truck(Gear gear){
        super(gear);
    }
    public void addGear(){
        System.out.print("Truck handles " );
        gear.handleGear();
    }
}
