/*Q2 — Média da Turma
Leia a quantidade n de estudantes (n > 0). Em seguida, leia n notas do tipo double. Ao
final, informe a média da turma e quantos estudantes obtiveram nota maior ou igual a 7.0.*/

void main() {

    int alunos = Integer.parseInt(IO.readln("Digite a quantidade de alunos: "));
    double soma = 0;
    int aprovados = 0;

    for ( int i = 0; i < alunos; i++) {
        double notas = Double.parseDouble(IO.readln("Digite a nota do aluno: "));
        soma += notas;

        if (notas >= 7.0) {
            aprovados++;

        }}

        double media = soma / alunos;
        IO.println("A média da turma é: " + media);
        IO.println("A quantidade de alunos aprovados foi: " + aprovados);

    
}