package edu.silvano.x007Collections;

import java.util.*;

public class ExercicioPropostoSet002 {

    public static void main(String[] args) {

        Set<linguagem> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new linguagem("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new linguagem("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new linguagem("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<linguagem> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new linguagem("Python", 1991, "Pycharm"),
                        new linguagem("JavaScript", 1995, "IntelliJ"),
                        new linguagem("Java", 1991, "Visual Studio Code")
                )
        );
        for (linguagem linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<linguagem> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (linguagem linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<linguagem> minhasLinguagensFavoritas3 = new TreeSet<linguagem>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (linguagem linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<linguagem> minhasLinguagensFavoritas4 = new TreeSet<linguagem>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (linguagem linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<linguagem> minhasLinguagensFavoritas5 = new TreeSet<linguagem>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (linguagem linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);






    }

}



class ComparatorIde implements Comparator<linguagem>{

    @Override
    public int compare(linguagem lf1, linguagem lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<linguagem>{

    @Override
    public int compare(linguagem lf1, linguagem lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<linguagem>{

    @Override
    public int compare(linguagem lf1, linguagem lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

