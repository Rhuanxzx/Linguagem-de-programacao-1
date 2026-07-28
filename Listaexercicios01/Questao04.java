/*4. Faça um programa em Java que leia um vetor de 10 caracteres,
e diga quantas consoantes foram lidas. Imprima as consoantes.*/

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] letras = new char[10];
        char[] consoantes = new char[10];
        int contador = 0;

       
        for (int i = 0; i < letras.length; i++) {

            System.out.print("Digite a letra " + (i + 1) + ": ");
            letras[i] = scanner.next().charAt(0);

            if (letras[i] != 'a' && letras[i] != 'A' &&
                letras[i] != 'e' && letras[i] != 'E' &&
                letras[i] != 'i' && letras[i] != 'I' &&
                letras[i] != 'o' && letras[i] != 'O' &&
                letras[i] != 'u' && letras[i] != 'U') {

                consoantes[contador] = letras[i];
                contador++;
            }
        }

        System.out.println("\nConsoantes lidas:");

        for (int i = 0; i < contador; i++) {
            System.out.println(consoantes[i]);
        }

        System.out.println("Quantidade de consoantes: " + contador);

        scanner.close();
    }
}