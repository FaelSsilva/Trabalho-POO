#include <iostream>
#include <vector>
#include <string>

class Playlist {
private:
    std::string nome;
    std::vector<int> duracoesFaixas;

public:
    Playlist(std::string n) : nome(n) {}

    void adicionarFaixa(int duracaoEmSegundos) {
        duracoesFaixas.push_back(duracaoEmSegundos);
    }

    int calcularTempoTotal() const {
        int total = 0;
        for (int d : duracoesFaixas) {
            total += d;
        }
        return total;
    }
};
