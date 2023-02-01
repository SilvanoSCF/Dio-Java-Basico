package edu.silvano.x007Collections;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoListExemplo {

    public static void main(String[] args) {
        
    
    
    List<Gato> gatos = new ArrayList<Gato>(){{

        add(new Gato("Black", "Preto", 15));// Gatos
        add(new Gato("Branquinho", "Branco", 14));
        add(new Gato("Amarelão", "Amarelo", 13));
    }};
    System.out.println("Gatos: ");

    System.out.println(gatos.toString());
    

    
}

}
