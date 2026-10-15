import java.util.*;
import java.lang.*;
import java.io.*;

class Usuario {
    private int id;
    private String nome;
    private List<String> livrosEmprestados;

    public Usuario(int idUsuario, String nomeUsuario) {
        this.id = idUsuario;
        this.nome = nomeUsuario;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        livrosEmprestados.add(titulo);
    }

    public void removerLivro(String titulo) {
        livrosEmprestados.remove(titulo);
    }

    public int getQuantidadeEmprestimos() {
        return livrosEmprestados.size();
    }
}
