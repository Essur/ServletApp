package org.teikado.servletapp.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.teikado.servletapp.model.SeriesCalculator;

@Setter
@Getter
@Named("seriesBean")
@RequestScoped
public class SeriesBean {
    private Double x;
    private Integer n;
    private Double e;

    private Double sum;
    private Double limitedSum;
    private Double exactValue;

    public void calculateSeries() {
        SeriesCalculator calculator = new SeriesCalculator(x, n);

        sum = calculator.calculateSeriesSum();
        limitedSum = calculator.calculateLimitedSum(e);
        exactValue = calculator.compareWithExact();
    }
}