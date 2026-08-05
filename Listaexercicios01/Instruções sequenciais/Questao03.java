/*Crie um algoritmo/fluxograma/programa que leia 3 valores e escreva na tela a média ponderada
entre eles. O primeiro valor tem peso 4, o segundo valor tem peso 7 e o terceiro valor tem peso 3. */
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2, valor3,media;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

         System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        media = (valor1 * 4 + valor2 * 7 +valor3*3)/14.0;
        System.out.println("A média é: " + media);
        scanner.close();

    }

}
