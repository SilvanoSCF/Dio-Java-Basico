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
         * quando tivermos duas sobrecargas com a mesma quantidade de parametros, os tipos de dados devem ser diferentes para a diferenciação
         * no caso da area do retangulo e losangulo
         */

    }

}
