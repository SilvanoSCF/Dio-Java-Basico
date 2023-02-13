package edu.silvano.x007Collections;

public class Contato {

    private Integer Key;
    private String nome;
    private Integer numero;

    public Integer getKey() {
        return Key;
    }
    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void setKey(Integer key) {
        Key = key;
    }


    public Contato(){

    }
    
}
