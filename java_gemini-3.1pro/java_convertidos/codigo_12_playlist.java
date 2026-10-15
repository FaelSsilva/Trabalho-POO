import java.util.*;
import java.lang.*;
import java.io.*;

class Playlist {
    private String nome;
    private List<Integer> duracoesFaixas;

    public Playlist(String n) {
        this.nome = n;
        this.duracoesFaixas = new ArrayList<>();
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
