package computeExamples.computerIfPresent;

import java.util.HashMap;
import java.util.Map;

class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>(Map.of(
                "Alice", 28,
                "Bob", 65,
                "Carol", 55
        ));

        ages.computeIfPresent("Bob", (name, age) -> age >= 60 ? null : age);
        System.out.println(ages);
    }
}
