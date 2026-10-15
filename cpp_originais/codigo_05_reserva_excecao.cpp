#include <iostream>
#include <string>
#include <stdexcept>

class Emprestimo {
private:
    int limiteLivros;
    int livrosAtuais;

public:
    Emprestimo(int limite) : limiteLivros(limite), livrosAtuais(0) {}

    void registarEmprestimo() {
        if (livrosAtuais >= limiteLivros) {
            throw std::overflow_error("Limite maximo de emprestimos atingido!");
        }
        livrosAtuais++;
    }

    int getLivrosAtuais() const { return livrosAtuais; }
};
