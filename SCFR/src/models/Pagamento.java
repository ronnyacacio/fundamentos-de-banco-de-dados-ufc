package models;

import java.util.Date;
import java.util.Objects;

public class Pagamento {

    private  int idPagamento;
    private Conta conta;
    private Usuario usuario;
    private Date dataPagamento;

    public Pagamento(Conta conta, Usuario usuario, Date dataPagamento) {
        this.conta = conta;
        this.usuario = usuario;
        this.dataPagamento = dataPagamento;
    }

    public Pagamento() {
        super();
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return idPagamento == pagamento.idPagamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPagamento);
    }
}
