import java.util.*;
import java.lang.*;
import java.io.*;

class ItemAcervo {
    protected String codigo;
    protected String titulo;

    public ItemAcervo(String c, String t) {
        this.codigo = c;
        this.titulo = t;
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + codigo + " | Título: " + titulo);
    }
}

class Ebook extends ItemAcervo {
    private double tamanhoMB;

    public Ebook(String c, String t, double tamanho) {
        super(c, t);
        this.tamanhoMB = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do Ficheiro: " + tamanhoMB + " MB");
    }
}
