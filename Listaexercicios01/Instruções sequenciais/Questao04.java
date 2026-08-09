
/*4. Crie um algoritmo/fluxograma/programa que lê o nome de um aluno, as notas de suas três provas
e calcule e exiba na tela a média harmônica das provas. */
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, mediaHarmonica;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        mediaHarmonica = 3.0 / ((1.0 / nota1) + (1.0 / nota2) + (1.0 / nota3));
        System.out.println("A média é: " + mediaHarmonica);

        scanner.close();

    }

}
