package models;

public class Caixa {

    private double valor;

    public Caixa(double valor) {
        this.valor = valor;
    }

    public Caixa() {
        super();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
