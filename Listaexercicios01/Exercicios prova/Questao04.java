/*Q4 — Busca Linear
Leia 8 números inteiros para um vetor. Depois, leia um valor x. Informe a primeira posição
em que x aparece, considerando índice inicial 0, ou uma mensagem informando que o
valor não foi encontrado. */
void main() {

    int[] vetor = new int[8];

    for (int i = 0; i <= 7; i++) {
        vetor[i] = Integer.parseInt(IO.readln("Digite um número: "));

    }

    int x = Integer.parseInt(IO.readln("Digite um valor para x: "));
    int posicao = -1;

    
    for (int i = 0; i <= 7; i++) {
         if (vetor[i] == x){
            posicao = i;
            break;
         }

    }

    if (posicao!= -1){
        IO.println("O número foi encontrado na posição" + posicao);

    } else {
        IO.println("O número não foi encontrado");
    }

}
