#include <iostream>
#include <string>
#include <stdexcept>

class Triagem {
public:
    void avaliarEmergencia(int nivelNivelDor) {
        if (nivelNivelDor < 1 || nivelNivelDor > 10) {
            throw std::out_of_range("Nivel de dor invalido! Deve estar entre 1 e 10.");
        }
        if (nivelNivelDor >= 8) {
            std::cout << "Atendimento Imediato Necessario!" << std::endl;
        }
    }
};
