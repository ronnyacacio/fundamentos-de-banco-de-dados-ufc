package models;

import java.util.Objects;

public class Tarefa {

    private int idTarefa;
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public Tarefa() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return idTarefa == tarefa.idTarefa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarefa);
    }
}
