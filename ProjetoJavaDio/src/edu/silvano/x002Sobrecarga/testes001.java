package edu.silvano.x002Sobrecarga;

import java.util.Scanner;

public class testes001 {

        public static void main(String[] args) {

                Scanner leitor = new Scanner(System.in);
                int tamanho = leitor.nextInt();
                int i = 0;
                String y = "";

                while (i < tamanho) {
                        System.out.print(y + "/");
                        i++;
                }

        }

}
