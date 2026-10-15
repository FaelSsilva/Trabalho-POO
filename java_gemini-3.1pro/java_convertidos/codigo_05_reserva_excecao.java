import java.util.*;
import java.lang.*;
import java.io.*;

class Emprestimo {
    private int limiteLivros;
    private int livrosAtuais;

    public Emprestimo(int limite) {
        this.limiteLivros = limite;
        this.livrosAtuais = 0;
    }

    public void registarEmprestimo() {
        if (livrosAtuais >= limiteLivros) {
            throw new IllegalStateException("Limite maximo de emprestimos atingido!");
        }
        livrosAtuais++;
    }

    public int getLivrosAtuais() {
        return livrosAtuais;
    }
}
