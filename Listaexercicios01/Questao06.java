/*Faça um programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0. */

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] medias = new double[10];
        double soma = 0;
        int aprovados = 0;
    
        for (int i=0; i<medias.length; i++){
            soma=0;

            System.out.print("Aluno " + ( i + 1  ));
           
        
         
        for (int j=0; j<4; j++){
            
            System.out.print(" Digite a nota " + (j + 1) + ": ");
            soma+= scanner.nextDouble();
        
            }
          
            medias[i] =  soma / 4;
            
              
            if (medias[i]>=7.0){
                
                aprovados++;
                

            }}
            System.out.println("Quantidade de alunos com média maior ou igual a 7: " + aprovados);
            scanner.close();                
        
            

        }}
         
        