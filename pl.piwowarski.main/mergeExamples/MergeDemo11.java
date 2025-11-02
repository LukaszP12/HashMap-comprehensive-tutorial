package mergeExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MergeDemo11 {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 30)
        );

        Map<Integer, List<String>> usersGrouped = new HashMap<>();
        for (User u : users) {
            usersGrouped.merge(
                    u.age,
                    new ArrayList<>(List.of(u.name)),
                    (oldList, newList) -> {
                        oldList.addAll(newList);
                        return oldList;
                    }
            );
        }
        System.out.println(usersGrouped);
    }
}
