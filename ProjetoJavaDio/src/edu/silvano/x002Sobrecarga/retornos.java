package edu.silvano.x002Sobrecarga;

public class retornos {

    /*
     * Return instrução de interrupção
     * return
     * completa todas suas instruções
     * chega a uma declaração explicita de retorno
     * lança uma exceção
     */

     public static double area(int lado){// quadrado
        return lado * lado;
     }

     public static double area(double lado, double altura){// retangulo
        return lado * altura;
     }

     public static double area(double baseMaior, double baseMenor, double Altura){//trapezio
        return ((baseMaior + baseMenor) * Altura) / 2;
     }

     public static double area(float diagonal1, float diagonal2){ //
        return ((diagonal1 * diagonal2) / 2);
     }
    

}
