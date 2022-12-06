package lambdas.capturingLambda;

public class CapturingLambda {
    Trade trade = new Trade("IBM", 20000, "OPEN");

    public boolean isOpenTrade(){
        ITrade simpleLambda = (Trade t) -> t.isOpen();
        return simpleLambda.check(trade);
    }

    public boolean isOpenAndBig(int quantity) {
        ITrade openAndLargeTradeLambda = (Trade t) -> (t.isOpen() && t.getQuantity() > quantity);
         return openAndLargeTradeLambda.check(trade);
        }
}
