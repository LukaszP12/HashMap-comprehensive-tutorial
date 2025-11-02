package replaceAllExamples;

import java.util.HashMap;
import java.util.Map;

class replaceAllDemo4 {
    public static void main(String[] args) {
        Map<String, String> status = new HashMap<>(Map.of(
                "Task1", "Done",
                "Task2", null,
                "Task3", "Pending"
        ));

        status.replaceAll((task, value) -> value == null ? "Unknown" : value);

        System.out.println(status);
    }
}
