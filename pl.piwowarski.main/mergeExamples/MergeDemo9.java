package mergeExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MergeDemo9 {
    public static void main(String[] args) {
        Map<String, Set<String>> map1 = new HashMap<>();
        map1.put("fruits", new HashSet<>(Set.of("apple", "banana")));
        map1.put("colors", new HashSet<>(Set.of("red")));

        Map<String, Set<String>> map2 = new HashMap<>();
        map2.put("fruits", new HashSet<>(Set.of("orange")));
        map2.put("animals", new HashSet<>(Set.of("dog")));

        map2.forEach((key, value) ->
                map1.merge(key, value, (oldSet, newSet) -> {
                    oldSet.addAll(newSet);
                    return oldSet;
                })
        );

        System.out.println(map1);
    }
}
