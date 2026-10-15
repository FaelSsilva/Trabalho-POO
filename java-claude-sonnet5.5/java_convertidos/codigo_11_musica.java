import java.io.*;
import java.lang.*;
import java.util.*;

class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String t, String a, int d) {
        this.titulo = t;
        this.artista = a;
        this.duracaoSegundos = d;
    }

    public String getTitulo() { return titulo; }
    public int getDuracaoSegundos() { return duracaoSegundos; }

    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return String.valueOf(minutos) + "m " + String.valueOf(segundos) + "s";
    }
}
