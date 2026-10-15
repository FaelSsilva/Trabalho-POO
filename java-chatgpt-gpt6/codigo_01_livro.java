import java.util.*;
import java.lang.*;
import java.io.*;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String t, String a, int ano) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = ano;
        this.disponivel = true;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public boolean isDisponivel() { return disponivel; }

    public void emprestar() {
        if (disponivel) disponivel = false;
    }

    public void devolver() { disponivel = true; }
}
