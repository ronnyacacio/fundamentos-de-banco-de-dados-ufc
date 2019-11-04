package models;

public class Divida {

    private Usuario usuario;
    private Conta conta;
    private double valor;

    public Divida(Usuario usuario, Conta conta, double valor) {
        this.usuario = usuario;
        this.conta = conta;
        this.valor = valor;
    }

    public Divida() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
