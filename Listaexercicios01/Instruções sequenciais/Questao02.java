/*Crie um algoritmo/fluxograma/programa que leia 2 valores e escreva na tela a média ponderada
entre eles. O primeiro valor tem peso 40%, e o segundo valor tem peso 60%. */
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2, media;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        media = (valor1 * 0.4 + valor2 * 0.6) ;
        System.out.println("A média é: " + media);
        scanner.close();

    }

}
