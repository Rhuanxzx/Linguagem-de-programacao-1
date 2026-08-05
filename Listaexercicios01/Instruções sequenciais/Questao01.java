/*Crie um algoritmo/fluxograma/programa que leia dois valores numéricos, e calcule e exiba na
tela a média aritmética deles. */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, media;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        media = (valor1 + valor2) / 2;

        System.out.println("A média é: " + media);
        scanner.close();

    }

}
