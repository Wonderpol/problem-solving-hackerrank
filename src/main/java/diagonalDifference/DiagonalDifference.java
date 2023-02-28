package diagonalDifference;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRightDiagonal = 0;
        int rightToRightDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftToRightDiagonal += arr.get(i).get(i);
            rightToRightDiagonal += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(leftToRightDiagonal - rightToRightDiagonal);
    }

    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9))));
    }
}
