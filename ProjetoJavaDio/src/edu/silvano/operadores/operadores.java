package edu.silvano.operadores;

public class operadores {

    public static void main(String[] args) {

        String nome = "Silvano"; // = Atribuição

        // Aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 15;
        int multiplicacao = 20 * 3;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // Concatenação

        String valores = "Soma: " + soma + ", Subtração " + subtracao;

        System.out.println(nome + valores + multiplicacao + divisao + modulo + resultado);

        // Unários
        // + operador unário de valor positivo - numeros são positivos sem esse operador
        // explicitamente;
        // - operador de valor negativo nega um numero ou expressão aritmética
        // ++ operador de incremento de valor incrementando o valor de 1 unidade
        // -- operador de decrementação de valor , subtraindo o valor de 1 unidade
        // ! operador unário logico de negação - nega o valor de uma expressão booleana;

        int n1 = 5;

        System.out.println(++n1); // Atribuindo valor

        boolean varia001 = true;

        System.out.println(!varia001); // invertendo a logica de True para false

        // Operador ternário

        // O operador ternário é uma forma de resumida para definir uma condiçãi e
        // escolher por um dentre dois valores
        // como se fosse uma condição if normal, porem de uma forma em que toda a sua
        // estrutura estrará escrita numa unica linha.
        // : ?
        // <expressão condicional> ? <caso condição seja true> : <caso condição seja
        // false>

        // Exemplo if else comum

        int a = 5;
        int b = 6;

        if (a == b) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // condição com operador ternário

        String resultado001 = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado001);

        // Comparação

        String nomeUm = "Silvano";

        String nomeDois = new String("Silvano"); // Uma no string

        System.out.println("Resultado");

        System.out.println(nomeUm.equals(nomeDois)); // Logic true or false comparando se o valor é igual nos dois

        // Operadores Logicos

        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }

    }

}
