package edu.silvano.x007Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoListExemplo {

    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<Gato>() {
            {

                add(new Gato("Black", "Preto", 15));// Gatos
                add(new Gato("Branquinho", "Branco", 14));
                add(new Gato("Amarelão", "Amarelo", 13));
            }
        };
        System.out.println("Gatos: ");

        System.out.println(gatos.toString());

        System.out.println("Ordem Aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("------------------------");
        System.out.println("Ordem Natural");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("------------------------");

        System.out.println("Comparando por idade");

        Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade()); //comparando idade e ordenando

        //gatos.sort(new ComparatorIdade()); // Comparando tambem deste jeito 

        System.out.println(gatos);

        System.out.println("Comparando por cor");
        System.out.println("000000000000000000000");
        gatos.sort(new ComparatorCor());
        //Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("-");
        System.out.println("Comparando por nome car e idade");
        Collections.sort(gatos, new ComparatorTodos());
        System.out.println(gatos);

    }

}
