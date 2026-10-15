import java.io.*;
import java.lang.*;
import java.util.*;

class Playlist {
    private String nome;
    private List<Integer> duracoesFaixas = new ArrayList<Integer>();

    public Playlist(String n) {
        this.nome = n;
    }

    public void adicionarFaixa(int duracaoEmSegundos) {
        duracoesFaixas.add(duracaoEmSegundos);
    }

    public int calcularTempoTotal() {
        int total = 0;
        for (int d : duracoesFaixas) {
            total += d;
        }
        return total;
    }
}
