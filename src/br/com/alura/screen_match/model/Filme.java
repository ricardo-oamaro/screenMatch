package br.com.alura.screen_match.model;

import br.com.alura.screen_match.calc.Classificavel;

public class Filme extends Title implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public Filme(){
        super("", 0);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
    }

    @Override
    public int getclassificacao() {
        return (int) getMedia() / 2;
    }
}
