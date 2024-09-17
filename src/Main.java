import br.com.alura.screen_match.calc.CalculaTempo;
import br.com.alura.screen_match.calc.FiltroRecomendacao;
import br.com.alura.screen_match.model.Filme;
import br.com.alura.screen_match.model.Serie;

public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie();

        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2008);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(13);
        serie.setMinutosPorEpisodio(49);
        serie.getDuracaoEmMinutos();

        serie.exibeFichaTecnica();

        Filme filme = new Filme();
        filme.setNome("Pulp Fiction");
        filme.setAnoDeLancamento(1994);
        filme.setDuracaoEmMinutos(154);
        filme.setDiretor("Quentin Tarantino");

        filme.exibeFichaTecnica();


        CalculaTempo calc = new CalculaTempo();

        calc.calculaTempoTotal(filme);
        System.out.println("Tempo total: " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(filme);
    }
}