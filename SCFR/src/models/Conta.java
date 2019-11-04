package models;

import java.util.Date;
import java.util.Objects;

public class Conta {

    private int idConta;
    private Date vencimento;
    private String tipo;
    private String status;
    private double valor;

    public Conta(Date vencimento, String tipo, String status, double valor) {
        this.vencimento = vencimento;
        this.tipo = tipo;
        this.status = status;
        this.valor = valor;
    }

    public Conta() {
        super();
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
