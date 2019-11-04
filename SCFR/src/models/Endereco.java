package models;

import java.util.Objects;


public class Endereco{

    private Usuario usuario;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String numero;

    public Endereco(String cidade, String logradouro, String complemento, String bairro, String numero) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(){
        super();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
