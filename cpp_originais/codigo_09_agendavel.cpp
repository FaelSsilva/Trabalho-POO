#include <iostream>
#include <string>

class IAgendavel {
public:
    virtual ~IAgendavel() {}
    virtual bool agendar(const std::string& data, const std::string& hora) = 0;
};

class Consulta : public IAgendavel {
private:
    std::string veterinario;
    bool confirmada;

public:
    Consulta(std::string vet) : veterinario(vet), confirmada(false) {}

    bool agendar(const std::string& data, const std::string& hora) override {
        if (!data.empty() && !hora.empty()) {
            confirmada = true;
            return true;
        }
        return false;
    }
};
