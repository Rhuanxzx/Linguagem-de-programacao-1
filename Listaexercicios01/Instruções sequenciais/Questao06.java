/*Crie um algoritmo/fluxograma/programa que peça ao usuário para inserir dois números inteiros e,
em seguida, imprima o resultado da divisão do primeiro pelo segundo, considerando somente a
parte inteira. */

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, divisao;

        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextInt();

        System.out.println("Digigte o segundo numero:");
        n2 = scanner.nextInt();

        divisao = n1/n2;

        System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
        
        scanner.close();


    }
    
}
