package org.example.plusMinus;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int arrSize = arr.size();
        double positiveValuesCount = arr
                .stream()
                .filter(n -> n > 0)
                .count();
        double positiveNumbersRatio = positiveValuesCount / arrSize;

        double negativeValuesCount = arr
                .stream()
                .filter(n -> n < 0)
                .count();
        double negativeNumbersRatio = negativeValuesCount / arrSize;

        double zerosNumbersRatio = (arrSize - (positiveValuesCount + negativeValuesCount)) / arrSize;

        System.out.printf("%.6f%n", positiveNumbersRatio);
        System.out.printf("%.6f%n", negativeNumbersRatio);
        System.out.printf("%.6f%n", zerosNumbersRatio);
    }

    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }
}
