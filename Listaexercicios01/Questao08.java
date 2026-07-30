/*Faça um programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. */

import java.util.Scanner;

public class Questao08{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[5];
        double[] altura = new double[5];

        for (int i=0; i<idade.length; i++){
            System.out.println("Digite a idade e altura da pessoa " + (i+1) + ":");
            idade[i] = scanner.nextInt();
            altura[i] = scanner.nextDouble();

        }

        System.out.println("\n--- Exibindo na ordem inversa ---");

        for (int i=4; i >=0; i--){
           System.out.println("Pessoa " + (i + 1) + " com a idade: " + idade[i] + " tem a altura: " + altura[i]);
        }
        scanner.close();

    }
}