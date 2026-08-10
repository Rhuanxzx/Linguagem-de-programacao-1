/*8. Crie um algoritmo/fluxograma/programa que leia um ângulo em graus, calcule e imprima o seno
e o cosseno dele. Usar a biblioteca cmath. */

import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double graus, radianos, seno, cosseno;

        System.out.println("Digite os graus: ");
        graus = scanner.nextDouble();

        radianos = graus * Math.PI / 180;

        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);

        System.out.printf("O seno: %.3f%n" , seno);
        System.out.printf("O cosseno: %.3f%n" , cosseno);

        scanner.close();

        

    }
    
}
