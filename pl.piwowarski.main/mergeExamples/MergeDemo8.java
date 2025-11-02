package mergeExamples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

record Student(String name, String className, int grade) {
}

class MergeDemo8 {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", "Math", 8),
                new Student("Bob", "Math", 7),
                new Student("Carol", "History", 9),
                new Student("Dave", "Math", 8),
                new Student("Eve", "History", 9)
        );

        Map<String, Map<Integer, Integer>> classGradeCounts = new HashMap<>();

        for (Student s : students) {
            classGradeCounts.merge(
                    s.className(),
                    new HashMap<>(Map.of(s.grade(), 1)),
                    (oldGrades, newGrades) -> {
                        newGrades.forEach((grade, count) ->
                                oldGrades.merge(grade, count, Integer::sum)
                        );
                        return oldGrades;
                    }
            );
        }
        System.out.println(classGradeCounts);
    }
}
