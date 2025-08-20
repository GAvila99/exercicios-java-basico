package exercicios.heranca_e_poliformismo.ingresso;

public class Ingresso {
    protected String nomeFilme;
    protected double preco;
    protected boolean dublado;

    public Ingresso(String nomeFilme, double preco) {
        this.nomeFilme = nomeFilme;
        this.preco = preco;
        this.dublado = false;
    }

    public Ingresso(String nomeFilme, double preco, boolean dublado) {

    }

}