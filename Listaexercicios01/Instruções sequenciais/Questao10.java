
/*Crie um algoritmo/fluxograma/programa que solicite ao usuário um número decimal e, em
seguida, calcule e imprima o valor absoluto desse número. Usar a biblioteca cmath. */
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;

        System.out.println("Digite um número decimal: ");
        numero = scanner.nextDouble();

        System.out.println("O valor absoluto é: " + Math.abs(numero));

        scanner.close();

    }

}
