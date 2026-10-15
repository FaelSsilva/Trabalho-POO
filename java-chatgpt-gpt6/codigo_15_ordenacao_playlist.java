import java.util.*;
import java.lang.*;
import java.io.*;

class GerenciadorFaixas {
    private List<String> listaNomes = new ArrayList<>();

    public void adicionar(String nome) {
        listaNomes.add(nome);
    }

    public void ordenar() {
        Collections.sort(listaNomes);
    }

    public String obterPorIndice(int index) {
        if (index < 0 || index >= listaNomes.size()) {
            throw new IndexOutOfBoundsException("Indice fora do intervalo da playlist!");
        }
        return listaNomes.get(index);
    }
}
