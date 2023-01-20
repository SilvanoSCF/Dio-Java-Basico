package edu.silvano.testeObjetos;

/**
 * <h1>Car</h1>
 * 
 * @author Silvano filho
 */
public class Car {

    private String modelo;
    private String cor;
    private int capacidadeTanque;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    Double calculoTotalDespesa(int capacidadeTanque) {
        return capacidadeTanque * 4.5;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        System.out.println("Ola, método to String na area");
        return super.toString();
    }

    public Car() {

    }

    /**
     * <h2>Método Construtor Car</h2>
     * 
     * @param modelo
     * @param cor
     * @param capacidadeTanque
     */
    public Car(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        System.out.println("Iniciando método construtor de Car");
    }

}
