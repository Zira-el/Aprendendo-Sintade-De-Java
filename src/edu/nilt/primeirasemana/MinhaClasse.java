package edu.nilt.primeirasemana;

public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Nilt";
        String segundoNome = "Menezes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado de teste do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
