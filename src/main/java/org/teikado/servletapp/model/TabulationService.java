package org.teikado.servletapp.model;

import java.util.ArrayList;
import java.util.List;

public class TabulationService {

    /**
     * Generates tabulation results for the function y = tan(log(x)) over the range [a, b] with step size h.
     *
     * @param a starting value of x (inclusive)
     * @param b ending value of x (inclusive)
     * @param h step size for the range
     * @return List of tabulated results as formatted strings
     */
    public List<String> getTabulationResult(double a, double b, double h) {
        List<String> results = new ArrayList<>();

        if (h <= 0) {
            results.add("Error: Step size (h) must be greater than 0.");
            return results;
        }

        for (double x = a; x <= b; x += h) {
            results.add(calculateResultForX(x));
        }

        return results;
    }

    /**
     * Computes the result for a given x value and formats the output.
     *
     * @param x the input value for the function
     * @return a formatted string containing the result
     */
    private String calculateResultForX(double x) {
        try {
            if (x > 0) {
                double fx = Math.tan(Math.log(x));
                return String.format("x = %.2f, y = %.5f", x, fx);
            } else {
                return String.format("x = %.2f, y = undefined (x ≤ 0)", x);
            }
        } catch (Exception e) {
            return String.format("x = %.2f, Error: %s", x, e.getMessage());
        }
    }
}
