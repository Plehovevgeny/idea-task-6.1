package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int findLessThenAvg(int[] sales) {
        int averageSales = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if(sale < averageSales) {
                month += 1;
            }
        }
        return month;
    }

    public int findMoreThenAvg(int[] sales) {
        int averageSales = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if(sale > averageSales) {
                month += 1;
            }
        }
        return month;
    }
}
