package structural.adapter;

public class AdapterPlug implements Chargeable{
    SamsungJ6 samsungS6;

    public AdapterPlug(SamsungJ6 samsungS6) {
        this.samsungS6 = samsungS6;
    }

    @Override
    public void charge() {
        samsungS6.samsungCharge();
    }

    public String toString() {
        return "Samsung Mobile pretending to be Nokia Mobile ......";
    }

}
