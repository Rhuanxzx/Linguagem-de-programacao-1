/*Q5 — Métodos
Implemente e teste, no void main(), os seguintes métodos:
int maximo(int a, int b, int c)
boolean ehBissexto(int ano)
● ehBissexto: divisível por 400, ou divisível por 4 e não por 100.

String conceito(double media)
● conceito: A (≥ 9), B (≥ 7), C (≥ 5), D (demais).
● Recomendação: utilize uma expressão switch para conceito. */

int maximo(int a, int b, int c) {
    if (a >= b && a >= c) {
        return a; 
    } else if (b >= a && b >= c) {
        return b; 
    } else {
        return c;
    }
}

boolean ehBissexto(int ano){
return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

}

String conceito(double media){
    int notaInt = (int)media;

    return switch(notaInt){
    case 10, 9 -> "A";
    case 8, 7  -> "B";
    case 6, 5  -> "C";
    default    -> "D";
};
}

void main() {
  
    int maior = maximo(10, 25, 15);
    IO.println("Maior número: " + maior);

    
    boolean bissexto2024 = ehBissexto(2024);
    IO.println("2024 é bissexto? " + bissexto2024);

   
    String notaFinal = conceito(8.5);
    IO.println("Conceito para média 8.5: " + notaFinal);
}
