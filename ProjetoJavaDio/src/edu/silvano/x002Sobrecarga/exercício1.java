package edu.silvano.x002Sobrecarga;

/**
 * <h1>exercicio1</h1>
 * Calcular área de um retangulo ,quadrado ou trapézio com o mesmo método usando
 * Se informado um parametro, calculado a área do quadrado
 * Caso informe 2 valores seria lado x altura retangulo
 * Senão os 3 valores calcularão o trapezio
 * sobrecarga
 * 
 * @author Silvano filho
 * 
 * @version 1.0
 * 
 * @since 10/01/2023
 * 
 */
public class exercício1 {

    public static void area(double lado) {
        System.out.println("A área do quadrado é: " + lado);
    }

    public static void area(double lado, double altura) {
        System.out.println("A área do retangulo é: " + (lado * altura));
    }

    public static void area(double baseMaior, double baseMenor, double Altura) {
        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor) * Altura) / 2);
    }

     public static void area(float diagonal1, float diagonal2) {
         System.out.println("A área do losango é: " + (diagonal1 * diagonal2 / 2));
     }

}
