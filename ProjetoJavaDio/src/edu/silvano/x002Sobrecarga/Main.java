package edu.silvano.x002Sobrecarga;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculando a area:");

        // Quadrado l²
        exercício1.area(2);

        // retangulo (Base x altura)
        exercício1.area(2, 3);

        // Trapézio (baseMaior + baseMenor) * Altura) / 2)
        exercício1.area(4, 5, 2);

        // Losango (diagonal1 * diagonal2 / 2)
        exercício1.area(4f, 5f);

        /*
         * Observação
         * quando tivermos duas sobrecargas com a mesma quantidade de parametros, os
         * tipos de dados devem ser diferentes para a diferenciação
         * no caso da area do retangulo e losangulo
         */

        // exemplos com retornos

        System.out.println(" Aqui exemplos de retornos específicos");

        System.out.println(retornos.area(2));

        System.out.println(retornos.area(6, 5, 4));

        System.out.println(retornos.area(2f, 4f));

        System.out.println(retornos.area(3, 4));

    }

}