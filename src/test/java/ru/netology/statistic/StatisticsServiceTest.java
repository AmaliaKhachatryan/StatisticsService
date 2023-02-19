package ru.netology.statistic;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
  public  void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    public  void findMax1() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-15, -20, -59, -10, 0, -1, 0, -25};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    public  void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 10, -50, -20, 50, 659, 1520, -1525};
        long expected = 1520;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    public  void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    public  void findMax4() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 5, 6, 9, 100 };
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}