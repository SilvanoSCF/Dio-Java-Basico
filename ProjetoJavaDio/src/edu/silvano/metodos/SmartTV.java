package edu.silvano.metodos;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (ligada == true){
            System.out.println("Tv já está ligada");
        }
        ligada = true;
    }

    public void desligar(){
        if (ligada == false){
            System.out.println("Tv já estava desligada");
        }else{
            ligada = false;
        }
    }

}
