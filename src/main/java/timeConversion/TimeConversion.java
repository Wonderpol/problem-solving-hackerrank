package timeConversion;

public class TimeConversion {

    public static String timeConversion(String s) {
        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]);
        String minute = time[1];
        String seconds = time[2].substring(0, 2);
        boolean isAm = s.endsWith("AM");

        if (isAm) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d:%s:%s", hour, minute, seconds);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("04:59:59AM"));
    }
}
