package edu.silvano.tiposEVariaveis;

public class variaveisPrimitivas {

    public static void main(String[] args) {

        // Variáveis primitivas numericas

        byte numero1 = 1; // 1 byte
        short numero2 = 2; // 2 bytes
        int numero4 = 4; // 4 bytes
        long numero8 = 8L; // 8 bytes Lembrando que o tipo long finaliza em 'L'

        // Variáveis primitivas numeral

        float numeral = 4.0F; // 4 bytes Lembrando que o tipo float finaliza em 'F'
        double numeal2 = 8.0; // 8 bytes

        String texto01 = "texto";

        // Trabalhando com Constantes
        // São valores armazenados em memória que não podem ser modificados depois de
        // declarados.
        // Em Java, esses valores são representados pela palavra reservada 'final'.
        // por conversão, Constantes são sempre escritas em caixa alta. Nomenclatura
        // UPPER_CASE

        final double VALOR_DE_PI = 3.14; // Pi é um valor unico não pode ser alterado.

        // double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Convertendo para um tipo mais especifico - Casting

        System.out.println(numero4 + numero8 + numero2 +
                numeral + numeal2 + numero1 + numeroCurto + numeroCurto2 + numeroNormal + texto01 + VALOR_DE_PI);

    }

}
