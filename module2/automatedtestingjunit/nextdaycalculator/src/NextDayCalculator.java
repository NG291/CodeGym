public class NextDayCalculator {

    public static int[] nextDay(int day, int month, int year) {
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            monthArray[1] = 29;
        }
        day += 1;

        if (day > monthArray[month - 1]) {
            day = 1;
            month += 1;
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }
        return new int[]{day, month, year};
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
