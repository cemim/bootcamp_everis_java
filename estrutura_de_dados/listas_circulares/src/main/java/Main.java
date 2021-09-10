public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("C1");
        listaCircular.add("C2");
        listaCircular.add("C3");
        listaCircular.add("C4");
        listaCircular.add("C5");
        listaCircular.add("C6");

//        System.out.println(listaCircular);
//        listaCircular.remove(3);
//        System.out.println(listaCircular);

        for (int i = 0; i < 12; i++){
            System.out.println(listaCircular.get(i));
        }
    }
}
