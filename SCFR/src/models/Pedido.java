package models;

import java.util.Objects;

public class Pedido {

        private int idPedido;
        private Usuario usuario;
        private  String decricao;

    public Pedido(Usuario usuario, String decricao) {
        this.usuario = usuario;
        this.decricao = decricao;
    }

    public Pedido() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return idPedido == pedido.idPedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido);
    }
}
