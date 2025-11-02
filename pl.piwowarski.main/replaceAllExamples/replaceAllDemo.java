package replaceAllExamples;

import java.util.HashMap;
import java.util.Map;

class replaceAllDemo {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>(Map.of(
                "Apple", 1.2,
                "Banana", 0.8,
                "Orange", 1.5
        ));

        prices.replaceAll((item, price) -> price * 1.10);
    }
}
