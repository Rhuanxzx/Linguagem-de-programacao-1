/* Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. */
import java.util.Scanner;

public class Questao05 {
    public static void main (String[] args) {

      Scanner scanner = new Scanner (System.in);
      
      int[] numeros = new int [20];
      int[] par = new int [20];
      int[] impar = new int[20];

      int contadorPar = 0;
      int contadorImpar = 0;

      for (int i=0; i<numeros.length; i++)
        {
        System.out.print("Digite os numeros " + (i+1) + ":");
        numeros[i] = scanner.nextInt();

        if( numeros[i] % 2 == 0){

            par[contadorPar] = numeros[i];
            contadorPar++;
        }
        else
            {
             impar[contadorImpar] = numeros[i];
             contadorImpar++;

        }}

        System.out.print("\nTodos os números: ");

        for(int i = 0; i<numeros.length; i++)
        {
        System.out.print(numeros[i] + " ");
        }


        System.out.println("\nNumeros pares: ");
        for(int i=0; i<contadorPar; i++)
        {
            System.out.print(par[i] + " ");

        }
         System.out.println("\nNumeros ímpares: ");

        for(int i=0; i<contadorImpar; i++)
        {
            System.out.print(impar[i] + " ");
        }
        System.out.println();
        scanner.close();
      
    }
}