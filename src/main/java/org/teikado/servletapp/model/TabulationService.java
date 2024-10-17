package org.teikado.servletapp.model;

import java.util.ArrayList;
import java.util.List;

public class TabulationService {
    public List<String> getTabulationResult(double a, double b, double h) {
        List<String> results = new ArrayList<String>();
        for (double x = a; x <= b; x += h) {
            try {
                if (x > 0) {
                    double fx = Math.tan(Math.log(x));
                    results.add(String.format("x = %.2f,  y = %.5f", x, fx));
                } else {
                    results.add(String.format("x = %.2f,  y = undefined (x ≤ 0)", x));
                }
            } catch (Exception e) {
                results.add(String.format("x = %.2f,  Error: %s", x, e.getMessage()));
            }
        }
        return results;
    }
}
