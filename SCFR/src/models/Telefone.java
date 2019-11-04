package models;

import java.util.Objects;

public class Telefone {

    private  int idTelefone;
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public Telefone(){
        super();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return idTelefone == telefone.idTelefone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTelefone);
    }
}
