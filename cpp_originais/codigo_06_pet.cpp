#include <iostream>
#include <string>

class Pet {
private:
    std::string nome;
    std::string especie;
    int idade;
    double peso;

public:
    Pet(std::string n, std::string e, int i, double p) 
        : nome(n), especie(e), idade(i), peso(p) {}

    void setPeso(double novoPeso) {
        if (novoPeso > 0.0) {
            peso = novoPeso;
        }
    }

    double getPeso() const { return peso; }
    std::string getNome() const { return nome; }
};
