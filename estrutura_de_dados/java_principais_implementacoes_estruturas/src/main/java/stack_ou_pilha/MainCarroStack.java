package stack_ou_pilha;

import model.Carro;

import java.util.Stack;

public class MainCarroStack {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); // Mostra e remove o último elemento
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); // Mostra, mas não remove
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); // Verifica se a pilha está vazia
    }
}
