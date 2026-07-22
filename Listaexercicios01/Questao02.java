/*Faça um programa em Java que leia um vetor de 10 números reais e mostre-os na ordem inversa. */

public class Questao02{
    public static void main (String [] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println("Elemento na posição "+i+": "+ array[i]);}
    }
}