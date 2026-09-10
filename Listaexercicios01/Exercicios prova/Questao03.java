/*Q3 — Tabuada
Leia um número inteiro k, entre 1 e 10. Imprima a tabuada de k, de 1 a 10, no formato k x i
= resultado. */
void main() {
    int k = Integer.parseInt(IO.readln("Digite um número "));

    for (int i = 1; i <= 10; i++) {
        int resultado = k * i;
        IO.println( k + " x " + i + " = " + resultado);

    }

}
