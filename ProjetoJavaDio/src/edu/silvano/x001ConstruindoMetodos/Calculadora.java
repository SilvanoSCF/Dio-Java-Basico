package edu.silvano.x001ConstruindoMetodos;
/**
 * <h1>Calculadora</h1>
 * A calculadora realiza operações matemáticas entre numeros inteiros
 * <p>
 * <b>Note: </b>Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Silvano filho
 * @version 1.2
 * @since 10/01/2023
 * 
 */
public class Calculadora {
  /**
  * Este Método é utilizado para somar dois numeros inteiros
  * 
  * @param numero1 este é o primeiro parametro do metodo
  * @param numero2 este é o segundo parametro do metodo
  * @return resultado impresso pela variavel <b>resultado </b> que realiza a soma dos valores de numero1 e numero2
  */
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }
    
}
