package edu.silvano.metodos;

public class MainMetodos {

    public static void main(String[] args) {

        SmartTV sm = new SmartTV();

        System.out.println("Tv ligada ? " + sm.ligada);
        System.out.println("Tv ligada ? " + sm.canal);
        System.out.println("Tv ligada ? " + sm.volume);

        sm.desligar();

        sm.ligar();

    }

}
