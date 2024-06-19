import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    public void case1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int[] expected = {2, 1, 2018};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void case2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int[] expected = {1, 2, 2018};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void case3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int[] expected = {1, 5, 2018};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void case4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int[] expected = {1, 3, 2018};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void case5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int[] expected = {1, 3, 2020};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void case6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int[] expected = {1, 1, 2019};
        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }


}