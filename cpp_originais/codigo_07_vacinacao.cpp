#include <iostream>
#include <string>
#include <vector>

class CartaoVacinacao {
private:
    std::string nomePet;
    std::vector<std::string> vacinasAplicadas;

public:
    CartaoVacinacao(std::string pet) : nomePet(pet) {}

    void aplicarVacina(const std::string& vacina) {
        vacinasAplicadas.push_back(vacina);
    }

    bool possuiVacina(const std::string& vacina) const {
        for (const auto& v : vacinasAplicadas) {
            if (v == vacina) return true;
        }
        return false;
    }
};
