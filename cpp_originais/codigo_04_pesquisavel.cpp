#include <iostream>
#include <string>

class IPesquisavel {
public:
    virtual ~IPesquisavel() {}
    virtual bool coincidirTermo(const std::string& termo) const = 0;
};

class Revista : public IPesquisavel {
private:
    std::string titulo;
    int edicao;

public:
    Revista(std::string t, int e) : titulo(t), edicao(e) {}

    bool coincidirTermo(const std::string& termo) const override {
        return titulo.find(termo) != std::string::npos;
    }
};
