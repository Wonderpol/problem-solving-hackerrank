package countingSort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
        arr.forEach(val -> result.set(val, result.get(val) + 1));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSort(List.of(1, 2, 3, 3, 3, 4, 4, 5, 6)));
    }
}
