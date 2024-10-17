package org.teikado.servletapp.model;

public class SeriesCalculator {
    private final double x;
    private final int n;

    public SeriesCalculator(double x, int n) {
        this.x = x;
        this.n = n;
    }

    public double calculateSeriesSum() {
        double sum = x;
        double term = x;

        for (int i = 1; i <= n; i++) {
            term *= -(x * x);
            double coefficient = (double) (2 * i - 1) / (2 * i + 1);
            sum += coefficient * term;
        }

        return sum;
    }

    public double calculateLimitedSum(double e) {
        double sum = x;
        double term = x;

        for (int i = 1; i <= n; i++) {
            term *= -(x * x);
            double coefficient = (double) (2 * i - 1) / (2 * i + 1);
            double nextTerm = coefficient * term;

            if (Math.abs(nextTerm) > e) {
                sum += nextTerm;
            } else {
                break;
            }
        }

        return sum;
    }

    public double compareWithExact() {
        return Math.log(x + Math.sqrt(x * x + 1));
    }

}
