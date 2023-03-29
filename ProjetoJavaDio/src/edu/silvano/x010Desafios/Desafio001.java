import java.util.Scanner;

public class Desafio001 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        if (arquivoDoPc.contains("mp3")) // Verificado se na string possui algo mp3
        {
            System.out.println("Salvar"); // Salvar
        } else
            System.out.println("Deletar");
    }

    // TODO: Crie a condição necessária para verificar o formato do arquivo de
    // entrada

}
