package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldcalculateSum() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindAvg() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSales() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindLessThenAvg() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findLessThenAvg(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMoreThenAvg() {
        StatsService service = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMoreThenAvg(companySales);

        assertEquals(expected, actual);
    }
}