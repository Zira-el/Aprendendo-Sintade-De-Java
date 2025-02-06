package edu.nilt.terminaleargumentos;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args)  {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Digite o seu nome:");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "cm.");
        } catch ( InputMismatchException error ) {
            System.err.println("Os campos idade e altura precisam ser numéricos e as casas decimais devem ser separadas por ponto.");
        }

        scanner.close();
    }
}
