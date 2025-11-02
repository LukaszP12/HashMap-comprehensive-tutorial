import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DemoHashMap {

    record User(int id, String name) {
    }

    public static void main(String[] args) {
        constructors();
        basics();
    }


    // 1) Constructors
    static void constructors() {
        System.out.println("\n== Constructors ==");
        Map<String, Integer> a = new HashMap<>();                   // default
        Map<String, Integer> b = new HashMap<>(32);                 // capacity
        Map<String, Integer> c = new HashMap<>(16, 0.5f);           // capacity+load
        Map<String, Integer> seed = Map.of("x", 1, "y", 2);
        Map<String, Integer> d = new HashMap<>(seed);               // copy
        System.out.println("a=" + a + ", b.size=" + b.size() + ", c.size=" + c.size() + ", d=" + d);
    }

    // 2) Core CRUD
    static void basics() {
        System.out.println("\n== Core put/get/remove ==");
        Map<String, Integer> m = new HashMap<>();
        System.out.println("put('a',1) -> " + m.put("a", 1));      // null (new)
        System.out.println("put('a',7) -> " + m.put("a", 7));       // returns old 1
        System.out.println("get('a')    = " + m.get("a"));         // 7
        System.out.println("remove('a') = " + m.remove("a"));      // 7
        System.out.println("remove('a') = " + m.remove("a"));      // null (absent)
        m.put(null, 42);                                           // null key
        m.put("b", null);                                          // null value
        System.out.println("map now     = " + m);
        m.clear();
        System.out.println("cleared, size=" + m.size() + ", isEmpty=" + m.isEmpty());
    }
}
