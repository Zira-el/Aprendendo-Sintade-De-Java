package edu.nilt.tiposdedados;

public class TiposDeDados {
    public static void main(String[] args) {
        // Alguns tipos primitivos

        String meuNome = "Nilt Menezes";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 4 -> não é permitido a alteração e a variável deve ser escrita em caixa alta
    }
}
