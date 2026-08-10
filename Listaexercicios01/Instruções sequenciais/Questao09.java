
/*Crie um algoritmo/fluxograma/programa que peça ao usuário para inserir dois números inteiros e,
em seguida, imprima o resultado arredondada da divisão do primeiro pelo segundo. Usar a
biblioteca cmath. */
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, divisao;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        divisao = n1 / n2;
        long resultadoArredondado = Math.round(divisao);

        System.out.println("O resultado da divisão é: " + resultadoArredondado);
        scanner.close();
    }

}
