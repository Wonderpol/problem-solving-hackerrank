package pangrams;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        long numberOfChars = s.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();

        return numberOfChars == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
