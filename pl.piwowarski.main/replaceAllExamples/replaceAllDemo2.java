package replaceAllExamples;

import java.util.HashMap;
import java.util.Map;

class replaceAllDemo2 {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>(Map.of(
                "user1", "Welcome",
                "user2", "Hello",
                "user3", "Hi"
        ));

        messages.replaceAll((user, message) -> message + ", " + user + "!");
        System.out.println(messages);
    }
}
