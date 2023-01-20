package edu.silvano.testeObjetos;

public class testeGeral {

    public static void main(String[] args) {

        /*
         * Car car = new Car("Sandero", "Parta", 45);
         * System.out.println((car.getCapacidadeTanque()));
         * System.out.println("Diz pra mim");
         * 
         * }
         */

        Car c2 = new Car();
        c2.setModelo("BMW 313");
        c2.setCor("Azul");
        c2.setCapacidadeTanque(45);

        c2.calculoTotalDespesa(c2.getCapacidadeTanque());

        System.out.println("Modelo " + c2.getModelo());
        System.out.println("Cor " + c2.getCor());
        System.out.println("Capacidade de tanque " + c2.getCapacidadeTanque());
        System.out.println("Valor para abastecer: R$ " + c2.calculoTotalDespesa(c2.getCapacidadeTanque()));
        c2.calculoTotalDespesa(c2.getCapacidadeTanque());

        Car c3 = new Car("sandero", "Branco", 38);
        System.out.println("Modelo " + c3.getModelo());
        System.out.println("Cor " + c3.getCor());
        System.out.println("Capacidade de tanque " + c3.getCapacidadeTanque());
        System.out.println("Valor para abastecer: R$ " + c3.calculoTotalDespesa(c2.getCapacidadeTanque()));
        System.out.println(c3.calculoTotalDespesa(c3.getCapacidadeTanque()));

    }
}