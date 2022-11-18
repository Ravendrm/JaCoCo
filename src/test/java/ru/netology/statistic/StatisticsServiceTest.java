package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMaxA() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxE() {
        ru.netology.statistic.StatisticsService service = new StatisticsService();

        long[] incomeInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 25;

        long actual = service.findMax(incomeInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new StatisticsService();

        long[] incomeInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 17;

        long actual = service.findMax(incomeInBillions);

        assertEquals(expected, actual);
    }
}