package edu.silvano.anatomiaDasClasses;
public class BoeltimEstudantil {
    public static void main(String[] args) {
        // Exemplo de tabulação como boa pratica de programação.
        // A identação não altera resultado na programação, seria apenas para uma maior
        // visualização e entendimento do mesmo.
        int mediaFinal = 7;// valor interfere no resultado
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Prova minerva");
        } else {
            System.out.println("Aprovado");
        }

    }

}
