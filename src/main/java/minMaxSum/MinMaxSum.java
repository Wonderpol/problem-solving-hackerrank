package minMaxSum;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = Collections.max(arr);
        long max = Collections.min(arr);
        long sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }

        System.out.println((sum - min) + " " + (sum - max));
    }

    public static void main(String[] args) {
        miniMaxSum(List.of(1, 2, 3, 4, 5));
    }
}
