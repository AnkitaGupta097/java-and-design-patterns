package lambdas.capturingLambda;

public class Main {
    public static void main(String[] args) {
        CapturingLambda cl = new CapturingLambda();
        System.out.println(cl.isOpenTrade());
        System.out.println(cl.isOpenAndBig(1000));
    }
}
