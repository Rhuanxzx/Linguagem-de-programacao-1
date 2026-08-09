/*5. Crie um algoritmo/fluxograma/programa que solicite ao usuário 2 valores, em seguida, troque o
valor dessas variáveis e imprima os novos valores. */

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double valor1,valor2, valorAux;

        
       System.out.println("Digite o primeiro valor: ");
       valor1 = scanner.nextDouble();

       System.out.println("Digite o segundo valor: ");
       valor2 = scanner.nextDouble();

       valorAux = valor1;
       valor1 = valor2;
       valor2 = valorAux;

       System.out.println("Novo valor 1: " + valor1);
       System.out.println("Novo valor 2: " + valor2);

        scanner.close();




    }

}
