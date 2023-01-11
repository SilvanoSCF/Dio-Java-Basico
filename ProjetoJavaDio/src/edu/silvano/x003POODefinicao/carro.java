package edu.silvano.x003POODefinicao;

/**
 * <h1>Carro</h1>
 * Parametros String, String, int
 * 
 * @author Silvano filho
 * 
 */
public class carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    /**
     * <h2>calculoEncherTanque</h2>
     * Dois atributos double
     * 
     * @param valorCombustivel
     * @param capacidadeTo
     */
    public static void calculoEncherTanque(double valorCombustivel, double capacidadeTo) {

        System.out.println("O valor para encher o tanque seria: " + (valorCombustivel * capacidadeTo));

    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

    public carro() {
    }

    /**
     * <h2>carro construtor</h2>
     * 
     * @param capacidadeTanque
     * @param cor
     * @param modelo
     */
    public carro(int capacidadeTanque, String cor, String modelo) {
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;
        this.modelo = modelo;
    }

}
