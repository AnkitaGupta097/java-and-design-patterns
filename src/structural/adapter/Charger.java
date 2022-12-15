package structural.adapter;

public class Charger {
    public static void main(String[] args) {

        System.out.println("Let's Charge our mobiles one-by-one .... ");

        // Create a object of each mobile
        NokiaAsha nokiaAsha = new NokiaAsha();
        NokiaLumia nokiaLumia = new NokiaLumia();
        SamsungJ6 samsungJ6 = new SamsungJ6();

        AdapterPlug samsungAdapterPlug = new AdapterPlug(samsungJ6);

        // Calling Nokia charging method
        nokiaAsha.charge();
        nokiaLumia.charge();

        //using adapter plug to charge samsung mobile
        samsungAdapterPlug.charge();

    }
}
