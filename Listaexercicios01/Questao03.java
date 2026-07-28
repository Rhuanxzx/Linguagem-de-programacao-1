/*. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela. */
import java.util.Scanner;

public class Questao03{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double [4];
        double soma = 0;
        
        for (int i=0; i<notas.length; i++){
            System.out.print("Digite a nota " +(i+1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
            
        }
        double media = soma/notas.length;
        for (int i=0; i<notas.length;i++){
            System.out.println("Nota " + (i +1) + ":" + notas[i]);
           
        scanner.close();


    }System.out.println("A média é: " + media);
        }
} 