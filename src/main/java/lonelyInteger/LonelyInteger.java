package lonelyInteger;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        return a
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(lonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }
}
