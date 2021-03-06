/**
    Desafio
        Seu ex-colega de sala pediu que você desenvolvesse um programa com as seguintes características:

        Crie três variáveis para armazenar números inteiros;
         Leia o primeiro número, que pode ser um valor na faixa de: -10000 ≤ A ≤ 10000;
         Leia o segundo número, que pode ser um valor na faixa de: 0 ≤ B ≤ 99;
         Leia o terceiro número, que pode ser um valor na faixa de: 0 ≤ C ≤ 999;
         Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na primeira variável, uma virgula, um espaço em branco, a letra B, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na segunda variável, uma virgula, um espaço em branco, a letra C, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na terceira variável. Não esqueça de pular linha;
         Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e justificado a direita;
         Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e preenchido com zeros;
         Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e justificado a esquerda.

    Entrada
        A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. Na primeira linha tem um inteiro A (-10000 ≤ A ≤ 10000). Na segunda linha tem um inteiro B (0 ≤ B ≤ 99). Na terceira linha tem um inteiro C (0 ≤ C ≤ 999). Conforme mostrado no exemplo de entrada a seguir.

    Saída
        Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas da forma descrita no item 5. Conforme mostra o exemplo de saída a seguir.

    Exemplos de Entrada
         1234

         12

         123

     Exemplos de Saída
         A = 1234, B = 12, C = 123

         A =       1234, B =         12, C =        123

         A = 0000001234, B = 0000000012, C = 0000000123

         A = 1234      , B = 12        , C = 123

 */

import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);

        //implemente seu código aqui
        System.out.printf("A = %10d, B = %10d, C = %10d\n", A , B, C);
        System.out.printf("A = %s, B = %s, C = %s\n", String.format("%010d", A), String.format("%010d", B), String.format("%010d", C));
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", A , B, C);
    }
}
