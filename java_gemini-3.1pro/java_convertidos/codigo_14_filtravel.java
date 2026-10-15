import java.util.*;
import java.lang.*;
import java.io.*;

interface IFiltravel {
    boolean atendeClassificacao(int estrelasMinimas);
}

class FaixaAudio implements IFiltravel {
    private String nome;
    private int avaliacaoEstrelas;

    public FaixaAudio(String n, int estrelas) {
        this.nome = n;
        this.avaliacaoEstrelas = estrelas;
    }

    @Override
    public boolean atendeClassificacao(int estrelasMinimas) {
        return avaliacaoEstrelas >= estrelasMinimas;
    }
}
