package br.com.matheuspg.screenMatch.calculos;

import br.com.matheuspg.screenMatch.model.Filme;
import br.com.matheuspg.screenMatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
}
