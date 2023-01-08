package edu.silvano.metodos;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (ligada == true) {
            System.out.println("Tv já está ligada");
        }
        ligada = true;
        System.out.println("Tv ligada agora ...");
    }

    public void desligar() {
        if (ligada == false) {
            System.out.println("Tv já estava desligada");
        } else {
            ligada = false;
            System.out.println("Tv Desligada agora ...");
        }
    }

    public void diminuirVolume() {
        if (volume < 1) {
            System.out.println("Volume no minimo...");
        } else {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void almentarVolume() {
        if (volume > 80) {
            System.out.println("Volume no maximo...");
        } else {
            volume++;
            System.out.println("Volume: " + volume);

        }
    }

    public void status() {
        if (ligada == false) {
            System.out.println("Tv desligada... ");
        } else {
            System.out.println(volume);
            System.out.println(canal);
        }

    }

}
