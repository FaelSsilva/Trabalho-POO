import java.io.*;
import java.lang.*;
import java.util.*;

class Usuario {
    private int id;
    private String nome;
    private List<String> livrosEmprestados = new ArrayList<String>();

    public Usuario(int idUsuario, String nomeUsuario) {
        this.id = idUsuario;
        this.nome = nomeUsuario;
    }

    public void adicionarLivro(String titulo) {
        livrosEmprestados.add(titulo);
    }

    public void removerLivro(String titulo) {
        Iterator<String> it = livrosEmprestados.iterator();
        while (it.hasNext()) {
            if (it.next().equals(titulo)) {
                it.remove();
                break;
            }
        }
    }

    public int getQuantidadeEmprestimos() {
        return livrosEmprestados.size();
    }
}
