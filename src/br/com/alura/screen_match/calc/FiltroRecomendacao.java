package br.com.alura.screen_match.calc;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtro(Classificavel classificavel) {
        if (classificavel.getclassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if(classificavel.getclassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na lista de próximos");
        }

    }
}
