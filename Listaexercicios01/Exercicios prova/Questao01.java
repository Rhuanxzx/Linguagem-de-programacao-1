/*Q1 — Par ou Ímpar
Leia um número inteiro e informe se ele é par ou ímpar. Requisito: utilize o operador %. */

void main(){
    int numero = Integer.parseInt(IO.readln("Digite um número: "));

    if (numero % 2 == 0){

        System.out.println("O número " + numero + " é par");
    }
    else{
        System.out.println("O número " + numero + " é ímpar");
    }
}