package org.teikado.servletapp.beans;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.teikado.servletapp.model.TabulationService;

import java.io.Serializable;
import java.util.List;

@Named("tabulationBean")
@SessionScoped
@Getter
@Setter
public class TabulationBean implements Serializable {
    private double a;
    private double b;

    private double h;
    private List<String> results;

    private final TabulationService tabulationService = new TabulationService();


    public void tabulate() {
        results = tabulationService.getTabulationResult(a, b, h);
    }
}
