package sparseArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (String string : queries) {
            long number = strings
                    .stream()
                    .filter(s -> s.equals(string))
                    .count();
            result.add((int) number);
        }
        return result;
    }

    //Better time complexity O(n)
    public static List<Integer> matchingStringsRefactored(List<String> strings, List<String> queries) {
        Map<String, Integer> freaquencyMap = new HashMap<>();

        for (String string : strings) {
            freaquencyMap.put(string, freaquencyMap.getOrDefault(string, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(freaquencyMap.getOrDefault(query, 0));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(matchingStringsRefactored(List.of("ab", "ab", "abc"), List.of("ab", "abc")));
    }
}
