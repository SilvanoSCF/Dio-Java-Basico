package edu.silvano.x007Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

    public static void main(String[] args) {

        // Exemplos de List desde a versão anterior ao JDK5

        // List notas = new ArrayList(); // Antes do java 5

        // List<Double> notas = new ArrayList<Double>(); // Generics (jdk5) - Diamond
        // Operator(jdk)

        // ArrayList<Double> notas = new ArrayList<>();

        // List<Double> notas = new ArrayList<> (Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d,
        // 3.6));

        // List<Double> notas = Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

        // notas.add(10d);

        // System.out.println(notas);

        // -----------------------------------------------------------------------------------

        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

        // notas.add(1d);

        // notas.remove(5d);

        // System.out.println();

        List<Double> notas = new ArrayList<Double>();

        notas.add(4.0);
        notas.add(5.0);
        notas.add(4.9);
        notas.add(4.8);
        notas.add(41d);
        notas.add(4.2);
        notas.add(4.4);

        System.out.println(notas.toString());

        // [4.0, 5.0, 45.0, 43.0, 41.0, 4.2, 4.4] possivel retorno

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        // Exiba a posiç?o da nota 5.0: 1 sendo que a posição 1 é a segunda, pois a
        // primeira é a posição zero

        System.out.println("Adicione na lista a nota 8.0 na posição 4 ");
        notas.add(4, 8d); // posição elemento
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0 ");
        notas.set(notas.indexOf(5.0), 6.0); // Set substitui grava por cima indexof procura
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0)); // Retorno boleano para
                                                                                           // verificação se possui
                                                                                           // numero em lista
        if (notas.contains(5.0) == false) {
            System.out.println("O valor não está na lista.");
        } else {
            System.out.println("O valor está na lista");
        }

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // Verifica a menor nota do array
        System.out.println(notas.toString());

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // Verifica maior nota do array
        System.out.println(notas.toString());

        System.out.println("Exibir soma dos valores : ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
            System.out.println("Somando: " + soma + " valor adicionado >> " + next);
        }
        System.out.println("Exiba a soma dos valores" + soma);

        System.out.println("Exiba a media dos valores do array");
        System.out.println("Média " + (soma / notas.size())); // Pega soma e divide por quantidade de elementos do array
                                                              // size

        System.out.println("Remova a nota 8.0");
        notas.remove(8d); // ao colocar o 'd' voce identifica que o elemento a ser removido sera o de
                          // valor 8

        System.out.println("Remover nota por posição");
        notas.remove(0); // Ao informar somente o numero, nós removemos o elemento da posição 0 do array

        System.out.println("Removendo as notas abaixo de 5 e exibindo a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 5.0)
                iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista");
        notas.clear();
        System.out.println(notas);

    }

}