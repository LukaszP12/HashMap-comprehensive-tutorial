package computeExamples.computerIfPresent;

import java.util.HashMap;
import java.util.Map;

class Example1 {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>(Map.of(
                "Apple", 1.0,
                "Banana", 0.8
        ));

        // Apply 20% discount only if the product exists
        prices.computeIfPresent("Apple", (product, price) -> price * 0.8);
        prices.computeIfPresent("Cherry", (product, price) -> price * 0.8);

        System.out.println(prices);
    }
}
