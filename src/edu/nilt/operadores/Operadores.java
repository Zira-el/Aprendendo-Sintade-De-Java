package edu.nilt.operadores;

public class Operadores {
    public static void main (String[] args) {
        int numero = 5;

        numero = - numero; // inverte o sinal do número
        System.out.println("antes " + numero);
        numero = - numero; // retorna o número para positivo novamente
        System.out.println("depois " + numero);
    }
}
