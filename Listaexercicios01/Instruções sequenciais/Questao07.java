/*Crie um algoritmo/fluxograma/programa que declare uma variável do tipo ponto flutuante e
atribua a ela um valor informado pelo usuário. Em seguida, arredonde esse valor para duas casas
decimais e imprima o resultado. Usar a biblioteca iomanip. */

import java.util.Scanner;

public class Questao07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor: ");
        valor = scanner.nextDouble();

        System.out.printf("Valor arredondado: %.2f%n" , valor);
        
        scanner.close();

    }
    
}
