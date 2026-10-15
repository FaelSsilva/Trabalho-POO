#include <iostream>
#include <string>
#include <vector>

class Usuario {
private:
    int id;
    std::string nome;
    std::vector<std::string> livrosEmprestados;

public:
    Usuario(int idUsuario, std::string nomeUsuario) 
        : id(idUsuario), nome(nomeUsuario) {}

    void adicionarLivro(const std::string& titulo) {
        livrosEmprestados.push_back(titulo);
    }

    void removerLivro(const std::string& titulo) {
        for (auto it = livrosEmprestados.begin(); it != livrosEmprestados.end(); ++it) {
            if (*it == titulo) {
                livrosEmprestados.erase(it);
                break;
            }
        }
    }

    int getQuantidadeEmprestimos() const {
        return livrosEmprestados.size();
    }
};
