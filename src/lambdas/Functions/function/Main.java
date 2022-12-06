package lambdas.Functions.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;

        System.out.println(half.apply(10));

        //andThen

        Function<Integer, Double>  result = half.andThen(a -> 3 * a);
        System.out.println(result.apply(10));

        //compose

        Function<Integer, Double> composeResult = half.compose(a-> 3*a);
        System.out.println(composeResult.apply(5));

        //Identity
        Function<Integer, Integer> i = Function.identity();

        // Print statement
        System.out.println(i.apply(10));


        //BiFunction Interface

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a*b;
        System.out.println(add.apply(2,3));
        System.out.println(multiply.apply(2,3));

        //andThen

       BiFunction<Integer,Integer,Integer> composite = add.andThen(a -> 3 * a);

        System.out.println("Composite andThen result = " + composite.apply(2, 3));
    }

}
