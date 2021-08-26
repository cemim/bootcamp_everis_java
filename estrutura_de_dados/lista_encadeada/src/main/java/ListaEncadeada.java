public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);

    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Nao existe conteudo no índice " + index +
                    " desta lista. Esta lista so vai ate o indice " + ultimoIndice + '.');
        }
    }

    public int size(){
        int tanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
}
