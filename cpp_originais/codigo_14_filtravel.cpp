#include <iostream>
#include <string>

class IFiltravel {
public:
    virtual ~IFiltravel() {}
    virtual bool atendeClassificacao(int estrelasMinimas) const = 0;
};

class FaixaAudio : public IFiltravel {
private:
    std::string nome;
    int avaliacaoEstrelas;

public:
    FaixaAudio(std::string n, int estrelas) : nome(n), avaliacaoEstrelas(estrelas) {}

    bool atendeClassificacao(int estrelasMinimas) const override {
        return avaliacaoEstrelas >= estrelasMinimas;
    }
};
