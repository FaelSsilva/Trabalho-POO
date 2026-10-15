import java.io.*;
import java.lang.*;
import java.util.*;

interface IPesquisavel {
    boolean coincidirTermo(String termo);
}

class Revista implements IPesquisavel {
    private String titulo;
    private int edicao;

    public Revista(String t, int e) {
        this.titulo = t;
        this.edicao = e;
    }

    @Override
    public boolean coincidirTermo(String termo) {
        return titulo.contains(termo);
    }
}
