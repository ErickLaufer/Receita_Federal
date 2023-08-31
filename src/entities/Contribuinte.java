package entities;

public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();
}

