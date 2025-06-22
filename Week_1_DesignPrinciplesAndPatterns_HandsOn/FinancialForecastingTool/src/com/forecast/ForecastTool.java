package com.forecast;

public class ForecastTool {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double currentValue = 10000.0;   // ₹10,000
        double annualGrowthRate = 0.08; // 8%
        int years = 5;

        double futureValue = calculateFutureValue(currentValue, annualGrowthRate, years);

        System.out.printf(" Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
