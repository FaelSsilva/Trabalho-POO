#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <stdexcept>

class GerenciadorFaixas {
private:
    std::vector<std::string> listaNomes;

public:
    void adicionar(const std::string& nome) {
        listaNomes.push_back(nome);
    }

    void ordenar() {
        std::sort(listaNomes.begin(), listaNomes.end());
    }

    std::string obterPorIndice(size_t index) const {
        if (index >= listaNomes.size()) {
            throw std::out_of_range("Indice fora do intervalo da playlist!");
        }
        return listaNomes[index];
    }
};
