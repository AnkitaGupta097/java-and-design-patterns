package lambdas.capturingLambda;

public class Trade {
    private String instrument = null;

    private String status = null;

    private int quantity = 0;

    public Trade(String instrument, int quantity, String status) {
        this.quantity = quantity;
        this.instrument = instrument;
        this.status = status;
    }

    public boolean isOpen() {
       return (this.status == "OPEN") ? true : false;
    }

    public boolean isCancelledTrade() {
        return (this.status == "CANCELLED") ? true : false;
    }

    public boolean isBig() {
        return getQuantity() > 20000 ? true : false;
    }

    public int getQuantity() {
        return quantity;
    }
}
