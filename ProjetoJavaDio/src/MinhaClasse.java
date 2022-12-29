public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem vindos ...");

        String primeiroNome = "Silvano";
        String segundoNome = "Filho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
