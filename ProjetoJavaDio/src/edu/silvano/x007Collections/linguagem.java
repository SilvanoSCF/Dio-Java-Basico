package edu.silvano.x007Collections;

import java.util.*;

public class linguagem implements Comparable<linguagem> {

    public String nome;
    public Integer anoCriacao;
    public String ide;

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    public linguagem(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int compareTo(linguagem o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
