package lambdas.Functions.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main{
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(101);
        int count = 0;

        while(count++ < 5) System.out.println(randomSupplier.get());

    }
}