package br.com.alura.screen_match.calc;

import br.com.alura.screen_match.model.Title;

public class CalculaTempo {

    public int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void calculaTempoTotal(Title title) {
        this.tempoTotal += title.getDuracaoEmMinutos();
    }
}
