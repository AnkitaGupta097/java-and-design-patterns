package lambdas.Functions.predicate;

import lambdas.capturingLambda.Trade;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isStringStartWithAorE = (s) -> s.startsWith("A") ||  s.startsWith("E") ;

        String name = "Ankita";
        //predicate functional interface
        System.out.println(isStringStartWithAorE.test(name));

        Trade trade = new Trade("IBM", 30000, "CANCELLED");

        //COMPOSING PREDICATES

       Predicate<Trade> isBigTrade = (t) -> trade.isBig();
        Predicate<Trade> isOpenTrade = (t) -> trade.isOpen();
        Predicate<Trade> isCancelledTrade = (t) -> trade.isCancelledTrade();

        //Logical OR
       Predicate<Trade> isBigOrCancelled = isBigTrade.or(isCancelledTrade);
        System.out.println(isBigOrCancelled.test(trade));

        //OR and AND
       Predicate<Trade> isOpenOrCancelledAndBig = isOpenTrade.or(isCancelledTrade).and(isBigTrade);
        System.out.println(isOpenOrCancelledAndBig.test(trade));

       //Negate
       Predicate<Trade> notAnOpenTrade = isOpenTrade.negate();
        System.out.println(notAnOpenTrade.test(trade));


        //Equals
        Predicate<Trade> p1= Predicate.isEqual(trade);

        System.out.println(p1.test(trade));

        //BiPredicate

        BiPredicate<String, Integer> condition = (userName, marks) -> userName.equalsIgnoreCase("Ankita") && marks > 90;

        System.out.println(condition.test("Ankits", 100));

        System.out.println(condition.test("XYZ", 100));

        System.out.println(condition.test("ABC", 90));


    }
}

