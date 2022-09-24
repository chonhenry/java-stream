import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream().filter(price -> price < 5)
        .forEach(price -> System.out.println());

        List<Double> lowPrices = new ArrayList<>();
        lowPrices.addAll(prices.stream().filter(price -> price < 5)
        .collect(Collectors.toList()));
        System.out.println(lowPrices); // [1.99, 4.99]

        List<Double> withTax = new ArrayList<>();
        withTax.addAll(prices.stream().map(price -> price * 1.08875)
        .collect(Collectors.toList()));
        System.out.println(withTax); // [2.1666125000000003, 5.432862500000001, 11.965362500000001, 17.409112500000003]

        List<Double> updatedPrices = new ArrayList<>();
        updatedPrices.addAll(prices.stream().filter(price -> price < 5)
        .map(price -> price * 1.08875)
        .collect(Collectors.toList()));
        System.out.println(updatedPrices); // [2.1666125000000003, 5.432862500000001]
    }
}
