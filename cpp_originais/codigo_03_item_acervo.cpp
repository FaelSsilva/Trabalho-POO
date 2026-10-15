#include <iostream>
#include <string>

class ItemAcervo {
protected:
    std::string codigo;
    std::string titulo;

public:
    ItemAcervo(std::string c, std::string t) : codigo(c), titulo(t) {}
    virtual ~ItemAcervo() {}

    virtual void exibirDetalhes() const {
        std::cout << "Código: " << codigo << " | Título: " << titulo << std::endl;
    }
};

class Ebook : public ItemAcervo {
private:
    double tamanhoMB;

public:
    Ebook(std::string c, std::string t, double tamanho) 
        : ItemAcervo(c, t), tamanhoMB(tamanho) {}

    void exibirDetalhes() const override {
        ItemAcervo::exibirDetalhes();
        std::cout << "Tamanho do Ficheiro: " << tamanhoMB << " MB" << std::endl;
    }
};
