/**
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

     Entrada
        A entrada é composta por vários casos de testes contendo valores inteiros.

     Saída
        Para cada valor lido mostre a mensagem correspondente à descrição do problema.

    Exemplo de Entrada
         2200
         1020
         2022
         2002

    Exemplo de Saída
         Senha Invalida
         Senha Invalida
         Senha Invalida
         Acesso Permitido

 * */

import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String senha = "2002";

        //implemente o seu código aqui
        while (leitor.hasNext()) {
            String texto = leitor.next();

            if (texto.equals(senha)){
                System.out.println("Acesso Permitido");
                System.exit(0);
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
