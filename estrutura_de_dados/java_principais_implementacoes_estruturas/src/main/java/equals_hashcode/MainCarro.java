package equals_hashcode;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainCarro {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("VolksWagen"));

        System.out.println("## Lista ##");
        System.out.println(listaCarros + "\n");

        System.out.println("# Testes na Lista #");
        // Retorna True por que foi implementado o método equals e hashcode
        System.out.println("contains Ford: " + listaCarros.contains(new Carro("Ford")));
        System.out.println("hashCode Ford: " + new Carro("Ford").hashCode());
        System.out.println("hashCode Ford1: " + new Carro("Ford1").hashCode());

        System.out.println("\n# Outros Testes #");
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println("Teste Equals: " + carro1.equals(carro2));
    }
}
