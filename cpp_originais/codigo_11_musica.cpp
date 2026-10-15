#include <iostream>
#include <string>

class Musica {
private:
    std::string titulo;
    std::string artista;
    int duracaoSegundos;

public:
    Musica(std::string t, std::string a, int d) 
        : titulo(t), artista(a), duracaoSegundos(d) {}

    std::string getTitulo() const { return titulo; }
    int getDuracaoSegundos() const { return duracaoSegundos; }

    std::string getDuracaoFormatada() const {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return std::to_string(minutos) + "m " + std::to_string(segundos) + "s";
    }
};
