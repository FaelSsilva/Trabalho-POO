#include <iostream>
#include <string>

class Livro {
private:
    std::string titulo;
    std::string autor;
    int anoPublicacao;
    bool disponivel;

public:
    Livro(std::string t, std::string a, int ano) 
        : titulo(t), autor(a), anoPublicacao(ano), disponivel(true) {}

    std::string getTitulo() const { return titulo; }
    std::string getAutor() const { return autor; }
    int getAnoPublicacao() const { return anoPublicacao; }
    bool isDisponivel() const { return disponivel; }

    void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    void devolver() {
        disponivel = true;
    }
};
