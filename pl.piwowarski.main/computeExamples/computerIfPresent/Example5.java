package computeExamples.computerIfPresent;

import java.util.HashMap;
import java.util.Map;

class Example5 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> sales = new HashMap<>(Map.of(
                "USA", new HashMap<>(Map.of("iPhone", 10, "iPad", 5))
        ));

        // Only update if both country and product exist
        sales.computeIfPresent("USA", (country, products) -> {
            products.computeIfPresent("iPhone", (prod, qty) -> qty + 5);
            return products;
        });
    }
}
