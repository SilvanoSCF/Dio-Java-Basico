package edu.silvano.x007Collections;

import java.util.Comparator;

public class ComparatorTodos implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome()); // Comparando nome
        if (nome != 0)
            return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor()); // Comparando cor
        if (cor != 0)
            return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade()); // Comparação idade
    }

}
